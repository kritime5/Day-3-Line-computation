package com.bridgelab.linecomp;


import static java.lang.Math.sqrt;
import java.util.*;

public class LineComputation {
    //UC-4-OOPS CONCEPT
    public double calculateLengthone(int x1,int x2,int y1,int y2){
        double length1= sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of line:"+length1);
        double calculateLengthone = 0;
        return calculateLengthone;
    }

    public double calculateLengthsecond(int x3,int x4,int y3,int y4){
        double length2= sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length of line:"+length2);
        double calculateLengthsecond = 0;
        return calculateLengthsecond;
    }
    // UC2-TO CHECK EQUALITY OF TWO LENGTH
    public void equals(){
        boolean length1 = false;
        boolean length2 = false;
        }

    //UC3-COMPARE TWO LENGTH
    public void compareTo(){
        double length1 = 0;
        double length2 = 0;
        }

    public static void main(String[] args) {
        System.out.println("Welcome to line computation");
        //uc1-model  a line based on point x,y co-ordinate
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int x1= sc.nextInt();
        int x2= sc.nextInt();
        int y1= sc.nextInt();
        int y2= sc.nextInt();

       // UC2-TO CHECK EQUALITY OF TWO LENGTH
        int x3= sc.nextInt();
        int x4= sc.nextInt();
        int y3= sc.nextInt();
        int y4= sc.nextInt();

        LineComputation l1=new LineComputation();
        LineComputation l2=new LineComputation();
        LineComputation l3=new LineComputation();
        LineComputation l4=new LineComputation();
        l1.calculateLengthone(1,2,3,4);
        l2.calculateLengthone(5,6,7,8);
        l3.calculateLengthone(9,8,7,6);
        l4.calculateLengthone(2,2,3,3);


        }

    }

