package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a principal: ");
        double p = sc.nextInt();
        System.out.print("Enter a rate: ");
        double r = sc.nextInt();
        System.out.print("Enter a time: ");
        double t = sc.nextInt();
        double re = (p * r * t) / 100;
        System.out.print("Simple Interest: " + re);
    }
}
