package com.company;

import java.util.Scanner;

public class Main {

    private static double lengthTriangle1;
    private static double lengthTriangle2;
    private static double lengthTriangle3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first length of side of the triangle: ");
        lengthTriangle1 = scanner.nextDouble();
        System.out.println("Please enter second length of side of the triangle: ");
        lengthTriangle2 = scanner.nextDouble();
        System.out.println("Please enter third length of side of the triangle: ");
        lengthTriangle3 = scanner.nextDouble();

        double square1=Math.pow(lengthTriangle1,2);
        double square2=Math.pow(lengthTriangle2,2);
        double square3=Math.pow(lengthTriangle3,2);


        if(lengthTriangle1==lengthTriangle2 || lengthTriangle1==lengthTriangle3 || lengthTriangle2==lengthTriangle3)
            System.out.println("This triangle is an equilateral triangle");
        else
            System.out.println("This triangle is not an equilateral triangle");
        System.out.println("1 "+square1);
        System.out.println("2 "+square2);
        System.out.println("3 "+square3);
        if( square1+square2==square3 || square1+square3==square2 || square2+square3==square1)
            System.out.println("This triangle is a right triangle");
        else
            System.out.println("This triangle is not a right triangle");
    }
}
