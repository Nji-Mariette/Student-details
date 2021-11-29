package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String matricule;
    private ArrayList<Course> courses;

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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Student(String name, int age, String matricule) {
        this.name = name;
        this.age = age;
        this.matricule = matricule;
        this.courses = new ArrayList<>();
        courses.add(new Course("Maths"));
        courses.add(new Course("English"));
    }
    public Student() {
        this.name = name;
        this.age = age;
        this.matricule = matricule;
        this.courses = new ArrayList<>();
        courses.add(new Course("Maths"));
        courses.add(new Course("English"));
    }
    @Override
    public String toString(){
        return "name: "+this.getName()+ "\n"+
                "matricule: "+this.getMatricule()+"\n"+
                "age: "+this.getAge()+"\n"+
                "Average: "+this.getAverage();
    }
    private double getAverage(){
        double average = 0.0;
        for (int i=0;i<this.courses.size(); i++){
            average=(this.courses.get(0).getScore() + this.courses.get(1).getScore())/this.courses.size();
        }
        return average;
    }
}
