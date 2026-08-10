package If_Else;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();

        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        if (sp > cp) {
            int profit = sp - cp;
            double profitPercentage = (profit * 100.0) / cp;

            System.out.println("Profit is " + profit);
            System.out.println("Profit Percentage is " + profitPercentage + "%");
        }

        if (cp > sp) {
            int loss = cp - sp;
            double lossPercentage = (loss * 100.0) / cp;

            System.out.println("Loss is " + loss);
            System.out.println("Loss Percentage is " + lossPercentage + "%");
        }

        if (sp == cp) {
            System.out.println("No Profit No Loss");
        }
    }
}