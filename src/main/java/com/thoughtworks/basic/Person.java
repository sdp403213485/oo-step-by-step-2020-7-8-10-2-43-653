package com.thoughtworks.basic;

public class Person {
    private String name;
    private int age;

    public Person() {

    }

    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }

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


}
