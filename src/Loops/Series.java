package Loops;

import java.util.Scanner;

public class Series {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a = 1, b = n;
        for (int i=1; i<n; i++){
            System.out.println(a);
            System.out.println(b);
            a++;
            b--;
        }
    }
}
