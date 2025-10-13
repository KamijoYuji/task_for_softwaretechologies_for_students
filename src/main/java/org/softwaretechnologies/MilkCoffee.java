package org.softwaretechnologies;

// TODO: 09.12.2024 Создайте класс MilkCoffee, поддерживающий интерфейс CofeIntrface
//  к стоимости базового напитка добавьте 10.
//  к описанию добавьте " + milk"

public class MilkCoffee extends Coffee {
    private int cost;
    private String description;
    @Override
    public int getCost() {
        return cost + 10;
    }

    @Override
    public String description() {
        return description + " + milk";
    }

    public MilkCoffee(Coffee coffee) {
        description = coffee.description();
        cost = coffee.getCost();
    }
}
