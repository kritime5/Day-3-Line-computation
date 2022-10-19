package com.bridgelab.linecomp;

import static java.lang.Math.sqrt;
import java.util.*;

public class LineComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to line computation");
        //uc1-model  a line based on point x,y co-ordinate
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int x1= sc.nextInt();
        int x2= sc.nextInt();
        int y1= sc.nextInt();
        int y2= sc.nextInt();


        double length1= sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of line:"+length1);

       // UC2-TO CHECK EQUALITY OF TWO LENGTH
        int x3= sc.nextInt();
        int x4= sc.nextInt();
        int y3= sc.nextInt();
        int y4= sc.nextInt();
        double length2 = sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length of line:"+length2);
        System.out.println("length1.equals(length2)");

    }
}
