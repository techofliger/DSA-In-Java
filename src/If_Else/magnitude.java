package If_Else;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (Math.abs(n) < 69) {
            System.out.println("Magnitude is smaller than 69: " + n);
        } else {
            System.out.println("Magnitude is not smaller than 69: " + n);
        }
    }
}
