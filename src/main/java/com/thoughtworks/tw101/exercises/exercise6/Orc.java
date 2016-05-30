package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by sarqhlohmeier on 5/29/16.
 */
public class Orc implements Monster {

    String name;
    int hitPoints;

    public Orc() {
        name = "Orc";
        hitPoints = 20;
    }

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.printf("%s has %d hitpoints left!\n", name, hitPoints);
    }
}
