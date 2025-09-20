//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int CREDIT_CARD_BALANCE = 5000;
        double interestRate = 0.17;
        double monthlyBalance;


        monthlyBalance = CREDIT_CARD_BALANCE * interestRate;
        System.out.println("The interest due after one month is: " + monthlyBalance);
        monthlyBalance = monthlyBalance + monthlyBalance * interestRate;
        System.out.println("The interest due after two months is: " + monthlyBalance);




    }
}