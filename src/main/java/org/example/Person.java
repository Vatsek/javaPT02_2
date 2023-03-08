package org.example;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callAnimal(Animal an) {
        System.out.println(this.getName() + " позвал к себе " + an.getNickname());
        if (an instanceof Walking) {
            ((Walking) an).walk();
            System.out.println(an.getNickname() + " подошел к " + this.getName() + "у");
        } else {
            System.out.println(an.getNickname() + " не умеет ходить");
        }
        System.out.println();
    }
    public void voice(Animal an) {
        System.out.println(this.getName() + " попросил издать голос " + an.getNickname());
        if (an instanceof Voicing) {
            ((Voicing) an).voice();
        } else {
            System.out.println(an.getNickname() + " не умеет издавать голос");
        }
        System.out.println();
    }
    public void swim(Animal an) {
        System.out.println(this.getName() + " попросил поплавать " + an.getNickname());
        if (an instanceof Swimming) {
            ((Swimming) an).swim();
        } else {
            System.out.println(an.getNickname() + " не умеет плавать");
        }
        System.out.println();
    }

}
