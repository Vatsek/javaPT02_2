package org.example;

import java.util.Comparator;

public class hungerLevelComparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o2.getHungerLevel() - o1.getHungerLevel();
    }
}
