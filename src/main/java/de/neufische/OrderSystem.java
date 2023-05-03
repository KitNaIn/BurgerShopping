package de.neufische;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OrderSystem {


    private Map<String, Menu> menus;

    public OrderSystem() {
        menus = new HashMap<>();
    }

    public void addMenu(Menu menu) {
        this.menus.put(menu.getId(), menu);
    }

    public Menu getMenuById(String id) {
        return menus.getOrDefault(id, null);
    }

    public void displayMenus() {
        for (Map.Entry<String, Menu> entry : menus.entrySet()) {
            Menu menu = entry.getValue();
            System.out.println("Menü-ID: " + entry.getValue());
            System.out.println(menu.toString());
            System.out.println("------------------");
        }
    }

    @Override
    public String toString() {
        return "OrderSystem{" +
                "menus=" + menus +
                '}';
    }

    public void placeOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verfügbare Menüs: ");
        for (Menu menu : menus.values()) {
            System.out.println(menu);
        }

        while (true) {
            System.out.println("Geben sie die Menü-ID ein:");
            String menuID = scanner.nextLine();

            Menu menu = getMenuById(menuID);
            if (menu != null) {
                System.out.println("Sie haben bestellt:");
                System.out.println(menu);
                break;
            }else{
                System.out.println("Ungültige Menü ID, versuchs nochmal");
            }
       /* System.out.println("Du hast folgendes Menü bestellt: " + menu.getName());
        System.out.println("Main dish: " + menu.getMainDish());
        System.out.println("Side dish: " + menu.getSideDish());
        System.out.println("Beverage: " + menu.getBeverage());
        System.out.println("Price: " + menu.getPrice());*/



        }
        scanner.close();
    }

}