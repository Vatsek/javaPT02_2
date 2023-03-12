package org.example;

public class Dog extends Animal implements Walking, Voicing, Swimming{

    public Dog(String nickname, Integer age, Integer hungerLevel) {
        super(nickname, age, hungerLevel);
    }

    @Override
    public void voice() {
        System.out.println(this.getNickname() + " гавкает");
    }

    @Override
    public void walk() {
        System.out.println(this.getNickname() + " быстро бежит, виляя хвостом");
    }

    @Override
    public void swim() {
        System.out.println(this.getNickname() + " плавает");
    }
}
