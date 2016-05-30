package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by sarqhlohmeier on 5/29/16.
 */
public class Troll implements Monster {

    String name;
    int hitPoints;

    public Troll() {
        name = "Troll";
        hitPoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.printf("%s has %d hitpoints left!\n", name, hitPoints);
    }
}
