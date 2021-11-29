package com.company;

public class Course {
    private String title;
    private double score;

    public Course() {
        this.title = title;
        this.score = score;
    }

    public Course( String English){
        return ;
    }


    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return 0.0;
    }

    public double setScore(double score) {
        this.score = 0.0;
        return score;
    }

    public Course(String title, double score) {
        this.title = title;
        this.score = score;
    }
}
