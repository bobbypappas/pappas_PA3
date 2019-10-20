package pappas_p2;

class SavingsAccount
{
    static double annualInterestRate;
    double savingsBalance;

    static double modifyInterestRate(double newRate)
    {
        annualInterestRate = newRate;
        return annualInterestRate;
    }

    public double calculateMonthlyInterest()
    {
        double monthlyInterest;
        SavingsAccount obj = new SavingsAccount();

        obj.savingsBalance = savingsBalance;

        monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance = savingsBalance + monthlyInterest;
        return savingsBalance;
    }
}
