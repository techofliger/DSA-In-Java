package Loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // 2,4,8,11,14
        int a = 2, d = 3;
        for(int i=1; i<=n; i++){
            System.out.println(a);
        a+=d;
        }
    }
}
