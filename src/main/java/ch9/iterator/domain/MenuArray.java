package ch9.iterator.domain;

import lombok.Getter;

@Getter
public class MenuArray {
    public static final int MAX_ITEM_COUNT = 5;
    private int itemCount;

    private MenuItem[] menuItems;

    public MenuArray() {
        menuItems = new MenuItem[MAX_ITEM_COUNT];

        for (int i = 0; i < 4; i++) {
            menuItems[i] = MenuItem.builder()
                    .name("menuItem" + i)
                    .description("in array, menuItem" + i)
                    .price(100)
                    .vegetarian(i % 2 == 0)
                    .build();

            addItemCount();
        }

    }

    public void addMenuItem(String name, String description, double price, boolean isVegetarian) {
        if (itemCount >= MAX_ITEM_COUNT) {
            throw new ArrayIndexOutOfBoundsException();
        }

        menuItems[itemCount++] = MenuItem.builder()
                .name(name)
                .description(description)
                .price(price)
                .vegetarian(isVegetarian)
                .build();
    }

    public void addItemCount(){
        itemCount++;
    }
}
