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


        double length = sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of line:"+length);
        

    }
}
