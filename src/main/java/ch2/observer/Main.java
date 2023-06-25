package ch2.observer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject(new ArrayList<>(), 26.6f, 50, 10);
        CurrentConditionDisplay displayer1 = new CurrentConditionDisplay(weatherSubject);

        displayer1.display();
        weatherSubject.notifyObservers();
        displayer1.display();

        displayer1.update(30.1f, 30, 5);
        displayer1.display();

        weatherSubject.notifyObservers();
        displayer1.display();
    }
}
