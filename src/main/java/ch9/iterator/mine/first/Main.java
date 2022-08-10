package ch9.iterator.mine.first;

import ch9.iterator.domain.MenuArray;
import ch9.iterator.domain.MenuList;
import ch9.iterator.mine.first.MenuDisplayer;

public class Main {
    public static void main(String[] args) {
        var menuDisplayer = MenuDisplayer.builder()
                .menuArray(new MenuArray())
                .menuList(new MenuList())
                .build();

        menuDisplayer.printMenus();
        System.out.println();

        menuDisplayer.printVegetarianMenuItems();

    }
}
