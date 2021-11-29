package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Course course = new Course();
		Student cour = new Student();
        ArrayList<Student> student = new ArrayList<>();
	student.add( new Student("Mariette",37,"UBa20"));
	student.add( new Student("Emy",32,"UBa23"));
	student.add( new Student("Thelma",36,"UBa29"));
	student.add( new Student("Serge",23,"UBa12"));
	student.add( new Student("Favour",21,"UBa45"));
	student.add( new Student("Vanibel",34,"UBa65"));
	student.add( new Student("Chelsea",32,"UBa21"));
	student.add( new Student("Ursulla",56,"UBa25"));
	student.add( new Student("Faithful",33,"UBa55"));
	student.add( new Student("Brandon",44,"UBa55"));
	student.add( new Student("Joshua",55,"UBa77"));
        System.out.println(student.size());
        for (int i=0; i<student.size(); i++){

			System.out.println("Enter score:");
			for (int j=0; j<cour.getCourses().size(); j++){
				double request = cour.getCourses().get(i).setScore(scanner.nextDouble());
			}
            System.out.println(student.get( i).toString());
        }
    }
}
