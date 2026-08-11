package If_Else;

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("Riya");
        }else if(n%3==0){
            System.out.println("Banu");
        }else if(n%5==0){
            System.out.println("Aporva");
        }else if(n%5==0 || n%3==0){
            System.out.println("Isha");
        }else{
            System.out.println("Doesn't have name.");
        }
    }
}
