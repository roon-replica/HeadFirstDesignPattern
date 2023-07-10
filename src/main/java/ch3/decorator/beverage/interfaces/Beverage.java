package ch3.decorator.beverage.interfaces;

import lombok.Getter;

@Getter
// 추상 클래스
public abstract class Beverage {
    protected String description = "No Description";

    public abstract double cost();
}
