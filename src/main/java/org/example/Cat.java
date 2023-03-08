package org.example;

public class Cat extends Animal implements Walking, Voicing{

    public Cat(String nickname, Integer age) {
        super(nickname, age);
    }
    @Override
    public void voice() {
        System.out.println(this.getNickname() + " мяукает");
    }
    @Override
    public void walk() {
        System.out.println(this.getNickname() + " медленно идёт");
    }
}
