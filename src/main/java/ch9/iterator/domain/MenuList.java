package ch9.iterator.domain;

import ch9.iterator.domain.MenuItem;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class MenuList {
    private List<MenuItem> menuItems = new ArrayList<>();

    public MenuList() {
        for (int i = 1; i <= 4; i++) {
            menuItems.add(
                    MenuItem.builder()
                            .name("menuItem" + i)
                            .description("in list, menuItem" + i)
                            .price(100)
                            .vegetarian(i % 2 == 0)
                            .build()
            );
        }
    }

    public void addMenuItem(String name, String description, double price, boolean isVegetarian) {
        menuItems.add(
                MenuItem.builder()
                        .name(name)
                        .description(description)
                        .price(price)
                        .vegetarian(isVegetarian)
                        .build()
        );
    }
}
