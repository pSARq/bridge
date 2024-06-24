package org.example1;

public class Cow extends Animal {

    public Cow(Meal meal) {
        super(meal);
    }

    @Override
    public void eat() {
        System.out.print("La vaca esta");
        meal.feed();
    }
}
