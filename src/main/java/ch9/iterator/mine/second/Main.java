package ch9.iterator.mine.second;

import ch9.iterator.domain.MenuArray;
import ch9.iterator.domain.MenuList;

public class Main {
    public static void main(String[] args) {
        var menuDisplayer = MenuDisplayer.builder()
                .arrayIterator(new ArrayIterator(new MenuArray()))
                .listIterator(new ListIterator(new MenuList()))
                .build();

        menuDisplayer.printMenus();

        menuDisplayer.printVegetarianMenuItems();

    }
}
