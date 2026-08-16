package Loops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        boolean flag = true; // true means prime
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){ // 'i' to ' 'n' for 1 factor
               flag=false;
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
        if(flag==false) System.out.println("Composite Number");
        if(flag==false) System.out.println("Prime Number");
    }
}
