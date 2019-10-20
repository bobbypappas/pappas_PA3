package pappas_p2;

import java.text.DecimalFormat;

public class Application {

    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount();
        saver1.savingsBalance = 2000.00;
        SavingsAccount saver2 = new SavingsAccount();
        saver2.savingsBalance = 3000.00;

        int i;
        var df = new DecimalFormat("#.00");

        //set annualInterestRate to 0.04
        SavingsAccount.modifyInterestRate(0.04);

        for (i = 1; i <= 12; i++)
        {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        //month 12 total balance
        System.out.println("Saver1 month 12 balance: " + df.format(saver1.savingsBalance));
        System.out.println("Saver2 month 12 balance: " + df.format(saver2.savingsBalance));

        //set annualInterestRate to 0.05
        SavingsAccount.modifyInterestRate(0.05);

        //month 13 with adjusted interest rate total balance
       System.out.println("Saver1 with adjusted interest rate month 13 balance: " + df.format(saver1.calculateMonthlyInterest()));
       System.out.println("Saver2 with adjusted interest rate month 13 balance: " + df.format(saver2.calculateMonthlyInterest()));
    }
}
