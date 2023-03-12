package org.example;

public abstract class Animal implements Comparable<Animal>{
    private String nickname;
    private Integer age;
    private Integer hungerLevel;


    public Animal(String nickname, Integer age, Integer hungerLevel) {
        this.nickname = nickname;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    @Override
    public String toString() {
        return this.nickname;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        }
        else return this.getNickname().equals(((Animal) obj).getNickname()) && this.getAge().equals(((Animal) obj).getAge());
    }

    @Override
    public int compareTo(Animal o) {
        return this.getAge()-o.getAge();
    }

    public void differenceAge(Animal o2){
            int difference = this.getAge() - o2.getAge();
            if (difference > 0){
                System.out.println(this.getNickname() + " старше " + o2 + " на " + difference + " года");
            }
            else if (difference < 0){
                System.out.println(o2 + " старше " + this.getNickname() + " на " + -difference + " года");
            }
            else {
                System.out.println(this + " одного возраста с " + o2);
            }
    }
}
