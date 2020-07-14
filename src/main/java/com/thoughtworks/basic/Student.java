package com.thoughtworks.basic;

import java.util.List;

public class Student extends Person {
    private Class classObject;

    public Student() {
        super();
    }
    public Student(String name, int age) {
        super(name, age);
    }

    public Student(Class classObject) {
        this.classObject = classObject;
    }

    public Student(String name, int age, Class classObject) {
        super(name, age);
        this.classObject = classObject;
    }

    @Override
    public String introduce() {
        return super.introduce() + "I am a Student of Class 2.";
    }
    
    
    //
    public void updateName(String newName){
        super.setName(newName);
    }

    public void updateClass(Class newClassObject){
        setClassObject(newClassObject);
    }

    private void setClassObject(Class newClassObject) {
    }

    public void Message(){
        System.out.println("My name is Tom. I am 21 years old. I am a student of Class 2 now.");
    }

    public void notifyWhenUpdateName(String oldName, String newName){
        if (!oldName.equals(newName)){
            updateName(newName);
            List<Student> students = classObject.getStudent();
            Teacher teacher = classObject.getTeacher();
            teacher.Message();
            for (int i=0;i<students.size();i++){
                students.get(i).Message();
            }
        }
    }

    public void notifyWhenUpdateClass(Class oldClass, Class newClass){
        if (oldClass.getClassNumber() != newClass.getClassNumber()){
            updateClass(newClass);
            List<Student> oldClassStudents = oldClass.getStudent();
            List<Student> newClassStudents = newClass.getStudent();
            Teacher oldClassTeacher = oldClass.getTeacher();
            Teacher newClassTeacher = newClass.getTeacher();
            oldClassTeacher.Message();
            newClassTeacher.Message();
            for (int i=0;i<oldClassStudents.size();i++){
                oldClassStudents.get(i).Message();
            }
            for (int j=0;j<newClassStudents.size();j++){
                newClassStudents.get(j).Message();
            }
        }
    }
}
