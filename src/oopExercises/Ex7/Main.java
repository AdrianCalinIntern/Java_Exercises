package oopExercises.Ex7;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.000);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.annualInterestRate = 4;
        System.out.println("Saver1: ");
        System.out.println("saver1: - MonthlyInterest = " + saver1.calculateMonthlyInterest() + '\n');

        System.out.println("Saver2: ");
        System.out.println("saver2: - MonthlyInterest = " + saver2.calculateMonthlyInterest() + "\n");

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Saver1: - InterestRateUpdated ");
        System.out.println("saver1: - MonthlyInterest = " + saver1.calculateMonthlyInterest() + '\n');

        System.out.println("Saver2: - InterestRateUpdated");
        System.out.println("saver2: - MonthlyInterest = " + saver2.calculateMonthlyInterest() + '\n');

    }
}
