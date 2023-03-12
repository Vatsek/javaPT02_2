package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван", 30);
        Cat cat = new Cat("Пушок", 6, 10);
        Dog dog = new Dog("Шарик", 5, 3);
        Fish fish = new Fish("Немо", 2, 7);
        Cat cat2 = new Cat("Пушок", 4, 4);
        Dog dog2 = new Dog("Шарик", 1, 5);

        fish.swim();
        ivan.callAnimal(fish);
        ivan.callAnimal(dog);
        ivan.callAnimal(cat);
        System.out.println("-".repeat(20));
        ivan.voice(fish);
        ivan.voice(cat);
        ivan.voice(dog);
        System.out.println("-".repeat(20));
        ivan.swim(fish);
        ivan.swim(cat);
        ivan.swim(dog);

        ArrayList<Animal> an = new ArrayList<>();
        an.add(cat);
        an.add(dog);
        an.add(fish);
        an.add(cat2);
        an.add(dog2);

        Collections.sort(an, new hungerLevelComparator());
        System.out.println("По уровню голода, животных нужно кормить в следующем порядке:\n" +an);

        if (cat.equals(cat2)){
            System.out.println("2 кота одинаковые");
        }
        else System.out.println("2 кота разные");

        if (dog.equals(dog2)){
            System.out.println("2 собаки одинаковые");
        }
        else System.out.println("2 собаки разные");

        System.out.println("Входит ли " + ivan.getName() + " в класс животных: " + cat.equals(ivan));
        
        Collections.sort(an, new AnimalAgeComparator());
        System.out.println("Животные, отсортированные по возрасту по возрастанию: "+an);

        cat.differenceAge(fish);
        fish.differenceAge(cat);
        fish.differenceAge(dog);


    }
}