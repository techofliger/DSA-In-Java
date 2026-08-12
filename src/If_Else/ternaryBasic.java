package If_Else;

import java.util.Scanner;

public class ternaryBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        // if(n%2==0) System.out.println("Even");
        // else System.out.println("Odd");
        // condition ? right : wrong
        System.out.println((n%2==0) ? "Even" : "Odd");

    }
}


