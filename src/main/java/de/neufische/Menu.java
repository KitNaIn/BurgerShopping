package de.neufische;

import java.util.Objects;

public class Menu {

    private String id;
    private String name;
    private double price;
    private String mainDish;
    private String sideDish;
    private String beverage;

    public Menu() {
    }

    public Menu(String id, String name, double price, String mainDish, String sideDish, String beverage) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.mainDish = mainDish;
        this.sideDish = sideDish;
        this.beverage = beverage;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getMainDish() {
        return mainDish;
    }

    public String getSideDish() {
        return sideDish;
    }

    public String getBeverage() {
        return beverage;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", mainDish='" + mainDish + '\'' +
                ", sideDish='" + sideDish + '\'' +
                ", beverage='" + beverage + '\'' +
                '}';
    }
}
