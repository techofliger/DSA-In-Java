package Loops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int r = 0 ;
        if(n<0) n = -n;
        int sum = 0;
        while(n!=0){
            r*=10;
            r+=n%10;
            sum+=n%10;
            n/=10;
        }
        System.out.println("Reverse of all Numbers: "+r);
        System.out.println("Sum of all digits: "+sum);
    }
}
