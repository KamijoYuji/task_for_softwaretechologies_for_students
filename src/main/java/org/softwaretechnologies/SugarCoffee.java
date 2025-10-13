package org.softwaretechnologies;


// TODO: 09.12.2024 /**
//     Создайте класс SugarCoffee, поддерживающий интерфейс CofeIntrface
//     к стоимости базового напитка добавьте 20.
//     к описанию добавьте " + sugar"
//     */

public class SugarCoffee extends Coffee {
    private int cost;
    private String description;
    @Override
    public int getCost() {
        return cost + 20;
    }

    @Override
    public String description() {
        return description + " + sugar";
    }

    public SugarCoffee(Coffee coffee) {
        description = coffee.description();
        cost = coffee.getCost();
    }
}