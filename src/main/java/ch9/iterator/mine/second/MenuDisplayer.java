package ch9.iterator.mine.second;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
public class MenuDisplayer {
    private final MenuIterator arrayIterator;
    private final MenuIterator listIterator;

    public void printMenus() {
        printMenus(arrayIterator);
        printMenus(listIterator);
    }

    private void printMenus(MenuIterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.getNext());
        }
    }

    public void printVegetarianMenuItems() {
        printVegetarianMenuItems(arrayIterator);
        printVegetarianMenuItems(listIterator);
    }

    private void printVegetarianMenuItems(MenuIterator iterator) {
        while (iterator.hasNext()) {
            var menuItem = iterator.getNext();
            if (menuItem.isVegetarian()) {
                System.out.println(menuItem);
            }
        }
    }

}
