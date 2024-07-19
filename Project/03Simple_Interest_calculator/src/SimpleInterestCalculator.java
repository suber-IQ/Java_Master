import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        //create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //prompt user for principal amount
        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();


        //prompt user for rate of interest
        System.out.println("Enter the rate of interest: ");
        double rate = scanner.nextDouble();

        //prompt user for the time period in years
        System.out.println("Enter the time period in years: ");
        int time = scanner.nextInt();

        //calculate simple interest
        double simpleInterest = (principal * rate * time)/100;

        //display the result
        System.out.println("Simple Interest: " + simpleInterest);

        //close the scanner
        scanner.close();
    }
}
