package Pattern_Printing;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number: ");
        int row = sc.nextInt();
        System.out.print("Enter column number: ");
        int col = sc.nextInt();
        for (int i = 1; i <= row; i++) {  // No. of lines
            for (int j = 1; j <= col; j++) { // How many star
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
