package org.example1;

public class Leon extends Animal {

    public Leon(Meal meal) {
        super(meal);
    }

    @Override
    public void eat() {
        System.out.print("El león está");
        meal.feed();
    }
}
