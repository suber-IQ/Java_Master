package com.calculator.app;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1,num2,result;


        do {
            System.out.println("Simple Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice: ");
            choice = scanner.nextInt();

            if(choice >= 1 && choice <= 4){
                System.out.println("Enter first Number: ");
                num1 = scanner.nextDouble();
                System.out.println("Enter second Number: ");
                num2 = scanner.nextDouble();

                switch(choice){
                    case 1:
                        result = calculator.add(num1,num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = calculator.subtract(num1,num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = calculator.multiply(num1,num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        try {
                            result = calculator.divide(num1, num2);
                            System.out.println("Result: " + result);
                        } catch (ArithmeticException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                }

            }else if(choice != 5){
                System.out.println("Invalid choice. Please try again.");
            }
        }while (choice != 5);

        System.out.println("Exiting...");
        scanner.close();
    }
}
