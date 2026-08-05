package Basics;

import java.util.Scanner;

public class SumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter the second numbers: ");
        int b = sc.nextInt();
        System.out.print("Enter the three numbers: ");
        int c = sc.nextInt();
        int d = a + b + c;
        System.out.print("Sum of three number: ");
        System.out.println(d);
    }
}
