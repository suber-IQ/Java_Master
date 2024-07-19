import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static double celsiusToKelvin(double celsius){
        return celsius + 273.15;
    }
    public static double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }
    public static double fahrenheitToKelvin(double fahrenheit){
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
    public static double kelvinToFahrenheit(double kelvin){
        return (kelvin - 273.15) * 9/5 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

       int choice;
        do{
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("Choose an option: ");
            choice = scanner.nextInt();

            double inputTemp, convertedTemp;

        switch (choice) {
            case 1:
                System.out.println("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = celsiusToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + df.format(convertedTemp));
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = fahrenheitToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + df.format(convertedTemp));
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = celsiusToKelvin(inputTemp);
                System.out.println("Temperature in Kelvin: " + df.format(convertedTemp));
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = kelvinToCelsius(inputTemp);
                System.out.println("Temperature in Celsius: " + df.format(convertedTemp));
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = fahrenheitToKelvin(inputTemp);
                System.out.println("Temperature in Kelvin: " + df.format(convertedTemp));
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = scanner.nextDouble();
                convertedTemp = kelvinToFahrenheit(inputTemp);
                System.out.println("Temperature in Fahrenheit: " + df.format(convertedTemp));
                break;
//            default:
//                System.out.println("Invalid choice!");
//                break;
            case 7:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    } while( choice != 7);

        scanner.close();
    }
}
