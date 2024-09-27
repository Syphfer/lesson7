package org.example;

public class Cat {
    public String name;
    public int appetite;
    public boolean hungry;

    public Cat(String name, int appetite, boolean hungry) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = false;
    }

    public void eat(Plate p) {
p.decreaseFood(appetite);
    }
    public void info() {
        System.out.println(name + " " + hungry);
    }
}
