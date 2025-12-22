import java.util.Scanner;

public class rectangleArea {
    public static void main (String[] args){
        //variables to use
        double width = 0;
        double length = 0;
        double area = 0;

        //user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Width of the Rectangle : ");
        width = scanner.nextDouble();
        System.out.println("Enter the Length of teh Rectangle : ");
        length = scanner.nextDouble();
        //user output
        System.out.println("the Area of the Rectangle in cm is " + length*width);

        scanner.close();

    }
}
