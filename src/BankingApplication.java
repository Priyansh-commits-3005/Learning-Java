import java.math.BigDecimal;
import java.util.Scanner;


public class BankingApplication {

    static private BigDecimal balance = new BigDecimal("100.00");
    static Scanner scanner = new Scanner(System.in);

    /*
    Things to do
    - deposit
    - withdraw
    - showbalance
    - Display Menu
    - Exit Message
     */
    public static void main(String[] args){
        boolean isActive = true;
        int choice;
        while (isActive){
            System.out.println("--------------------------------------");
            System.out.println("Enter the Choice from the following : \n1. Show balance\n2. Withdraw\n3. Deposit\n4. Exit");
            System.out.println("--------------------------------------");
            choice = scanner.nextInt();


            switch (choice){
                case 1-> showBalance();
                case 2-> withdraw();
                case 3-> deposit();
                case 4 -> isActive = false;
            }


        }
    }
    static void deposit(){
        System.out.println("Enter the Amount : ");
        BigDecimal amtToDeposit = new BigDecimal("0");

        amtToDeposit = scanner.nextBigDecimal();
        if(amtToDeposit.compareTo(new BigDecimal("0"))<0){
            System.out.println("Your Amount cannot be negative you Buffon");
            return;
        }
        balance = balance.add(amtToDeposit);
        System.out.println("The amount "+amtToDeposit+" has been deposited to your account\nCurrent balance : "+balance);
    }
    static void withdraw(){
        System.out.println("Enter the Amount : ");
        BigDecimal amtToWithdraw = new BigDecimal("0");
        amtToWithdraw = scanner.nextBigDecimal();
        if(amtToWithdraw.compareTo(balance) <= 0) {
            balance = balance.subtract(amtToWithdraw);
            System.out.println("The amount " + amtToWithdraw + " has been withdrawn from your account\nRemaining balance : " + balance);
        }
        else{
            System.out.println("Are you trying to rob the bank ? you dont have that much money bro");
        }
    }
    static void showBalance(){
        System.out.println("Your Current balance is "+balance);
    }


}
