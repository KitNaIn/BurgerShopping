package de.neufische;

import javax.print.attribute.standard.DateTimeAtCompleted;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {






        Menu menu1 = new Menu ("1", "Heart attack menu", 18.50,"Bacon Cheeseburger","Loaded Bacon Fries","Coke" );
        Menu menu2 = new Menu ("2", "Veggie Lover", 16.50,"Tofu Burger","Loaded Cheese Fries","Orange Juice" );

        OrderSystem orderSystem = new OrderSystem();
        orderSystem.addMenu(menu1);
        orderSystem.addMenu(menu2);

        try {
            orderSystem.placeOrder();
        } catch (IllegalStateException e){
            System.out.println("Das Menü gibts gar nicht du Lappen!!");

        }





    }
}