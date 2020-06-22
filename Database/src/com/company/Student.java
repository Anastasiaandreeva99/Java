package com.company;

import java.util.Scanner;

public class Student {
    private String  firstName;
    private String  lastName;
    private int gradeYear;
    private String courses;
    private String tutionBalance;
    private static  int cost = 600;
    private  static int id=1000;
    private int studentId;
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student firstname:");
        firstName = scan.nextLine();
        System.out.print("Enter student lastnamee:");
        lastName = scan.nextLine();
        System.out.print("Enter student class level:");
        gradeYear = scan.nextInt();
        setID();
        id++;
    }
    private void setID()
    {
        studentId = gradeYear*10000+id;
    }



}
