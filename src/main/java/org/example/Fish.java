package org.example;

public class Fish extends Animal implements Swimming{
    public Fish(String nickname, Integer age) {
        super(nickname, age);
    }

    @Override
    public void swim() {
        System.out.println(this.getNickname() + " плавает");
    }
}
