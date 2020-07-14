package com.thoughtworks.basic;

public class Teacher extends Person {
  private String job;

    public Teacher() {
    }

    public Teacher(String job) {
        this.job = job;
    }

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String introduce() {
        return super.introduce() + "I am a Teacher.";
    }

    public String Message(){
        return "My name is Tom. I am 21 years old. I am a student of Class 2 now.";
    }
}
