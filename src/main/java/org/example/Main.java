package org.example;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person("Иван", 30);
        Cat cat = new Cat("Пушок", 5);
        Dog dog = new Dog("Шарик", 3);
        Fish fish = new Fish("Немо", 1);

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












    }
}