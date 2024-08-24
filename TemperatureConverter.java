package practice;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt for temperature value
        System.out.println("Enter temperature value: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return;
        }
        double value = sc.nextDouble();
        
        // Prompt for unit
        System.out.println("Enter 'c' to convert Celsius to Fahrenheit");
        System.out.println("Enter 'f' to convert Fahrenheit to Celsius: ");
        String unit = sc.next().toLowerCase(); // Convert to lowercase to handle both 'C' and 'F'
        
        // Convert and display the temperature
        switch(unit) {
            case "c":
                double fah = (value * 9/5) + 32;
                System.out.println("Converted value in Fahrenheit: " + fah);
                break;
            case "f":
                double cel = (value - 32) * 5/9;
                System.out.println("Converted value in Celsius: " + cel);
                break;
            default:
                System.out.println("Invalid unit. Please enter 'c' or 'f'.");
        }
        sc.close();
    }
}
