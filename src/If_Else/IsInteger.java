package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n-(int)n==0) System.out.print("Not an integer");
        else System.out.print("Is an integer");
    }

}
