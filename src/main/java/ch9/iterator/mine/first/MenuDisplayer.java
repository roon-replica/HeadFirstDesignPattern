package ch9.iterator.mine.first;

import ch9.iterator.domain.MenuList;
import ch9.iterator.domain.MenuArray;
import ch9.iterator.domain.MenuItem;
import lombok.Builder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 별 생각없이 손가는대로 구현한 list와 array를 함께 다루는 방법 ( array와 list를 하나의 list로 합쳤음)
public class MenuDisplayer {
    private MenuArray menuArray;
    private MenuList menuList;
    private List<MenuItem> mixedMenuItems;

    @Builder
    public MenuDisplayer(MenuArray menuArray, MenuList menuList) {
        this.menuArray = menuArray;
        this.menuList = menuList;

        mixedMenuItems = new ArrayList<>();
        mixedMenuItems.addAll(menuList.getMenuItems());

        for(int i=0; i< menuArray.getItemCount(); i++){
            mixedMenuItems.add(menuArray.getMenuItems()[i]);
        }
    }

    public void printMenus() {
        System.out.println(
                mixedMenuItems.stream()
                        .map(MenuItem::toString)
                        .collect(Collectors.joining("\n"))
        );
    }

    public void printVegetarianMenuItems() {
        System.out.println(
                mixedMenuItems.stream()
                        .filter(MenuItem::isVegetarian)
                        .map(MenuItem::toString)
                        .collect(Collectors.joining("\n"))
        );
    }
}
