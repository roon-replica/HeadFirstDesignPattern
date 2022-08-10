package ch9.iterator.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Builder
@AllArgsConstructor
@Getter
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
}
