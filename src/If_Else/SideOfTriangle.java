package If_Else;

import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        System.out.print("Enter a third number: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>c){
            System.out.print("Is a triangle.");
        }else{
            System.out.print("Is not a triangel.");
        }

    }
}
