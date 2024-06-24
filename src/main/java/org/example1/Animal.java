package org.example1;

public abstract class Animal {
    protected Meal meal;

    public Animal(Meal meal) {
        this.meal = meal;
    }

    public abstract void eat();

}
