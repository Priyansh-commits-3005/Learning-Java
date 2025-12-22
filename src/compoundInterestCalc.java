import java.util.Scanner;

public class compoundInterestCalc {
    public static void main(String[] args){
        //this is a compound interest calculator
        /*
        we will enter the interest rate , principal amount , and years and then will do calculation to output the capital gains
        and the amount after that amount of time
         */

        double principal , interestRate;
        int years , n=1;

        double amount , capitalGain , taxedTotalAmount;

        Scanner scanner = new Scanner(System.in);
        //input
        System.out.println("Enter the Principal Amount : ");
        principal = scanner.nextDouble();
        System.out.println("Enter the interest Rate : ");
        interestRate = scanner.nextDouble()/100;
        System.out.println("Enter the amount of years you are holding the principal");
        years = scanner.nextInt();

        amount = principal*Math.pow((1+(interestRate/n)),n*years);
        capitalGain = amount-principal;

        //long term capital gain is 12.5%
        //short term capital gain is 20% for less than 12 months


        taxedTotalAmount = principal + (capitalGain*0.875);

        //output
        System.out.printf("These are your stats - \n capital gained : %,.4f\n Amount returned : %,.4f\ntaxed amount (after LTCG tax) : %,.4f", capitalGain, amount , taxedTotalAmount);
    }
}
