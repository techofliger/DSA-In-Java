package Partten_Printing;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {  // No. of lines
            for (int j = 1; j <=n; j++) { // How many star
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}

