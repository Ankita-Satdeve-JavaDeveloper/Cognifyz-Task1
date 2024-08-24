package practice;

import java.util.Scanner;

public class TemperatureConverter {
	// In Java, a class is a blueprint for creating objects, but in this case, it's used to encapsulate the main method and the logic for the
	//temperature conversion.

    public static void main(String[] args) {
    	//This line defines the main method, which is the entry point of your Java application. The main method is always public, so it can be 
    	//called by the Java runtime, static, so it can be executed without creating an instance of the class, and it returns void, meaning it 
    	//doesn't return any value. The String[] args parameter allows your program to accept command-line arguments, though it's not used in 
    	//this particular program.
        Scanner sc = new Scanner(System.in);
        //This line creates a new Scanner object named sc. The Scanner class is used for capturing user input, and System.in specifies that 
    	//the input will be taken from the standard input stream, typically the keyboard.
        
        System.out.println("Enter temperature value: ");
        //This line prints a message to the console asking the user to enter a temperature value. System.out.println is used to display text 
    	//on the console, with println adding a newline after the message.
        
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return;
        }
        //This block checks if the next input is a valid double (a numeric value). sc.hasNextDouble() returns true if the input is a valid 
    	//double, and false otherwise. If the input is not valid, an error message is displayed, and the program terminates using return;.
        
        double value = sc.nextDouble();
        //This line reads the next double value entered by the user and stores it in the variable value.
        
        System.out.println("Enter 'c' to convert Celsius to Fahrenheit");
        System.out.println("Enter 'f' to convert Fahrenheit to Celsius: ");
        //These lines prompt the user to specify the conversion direction by entering either 'c' or 'f'. Each message is printed on a new line.
        
        String unit = sc.next().toLowerCase(); 
        //This line reads the next input from the user, which is expected to be either 'c' or 'f', and stores it in the unit variable as a string. 
        //The toLowerCase() method converts the input to lowercase to handle both uppercase and lowercase inputs ('C' or 'F').
        
        switch(unit) { //This line begins a switch statement that will execute different blocks of code based on the value of the unit variable.
            case "c": //This line defines the case for when the user enters "c" (Celsius to Fahrenheit conversion).
                double fah = (value * 9/5) + 32;
                //If the user chose to convert Celsius to Fahrenheit, this line performs the conversion. The formula (value * 9/5) + 32 converts 
                //the Celsius value to Fahrenheit and stores the result in the fah variable.
                
                System.out.printf("Converted value in Fahrenheit: %.2f%n", fah, "F");
                break; //The break statement exits the switch block, preventing the execution of any subsequent cases.
            case "f":
                double cel = (value - 32) * 5/9;
                //If the user chose to convert Fahrenheit to Celsius, this line performs the conversion. The formula (value - 32) * 5/9 converts 
                //the Fahrenheit value to Celsius and stores the result in the cel variable.
                System.out.printf("Converted value in Celsius: %.2f%n", cel, "'C");
                break;
            default:
                System.out.println("Invalid unit. Please enter 'c' or 'f'.");
                //The default case handles any situation where the user input is neither "c" nor "f". It prints an error message indicating that 
                //the input is invalid.
        }
        sc.close();
        //This line closes the Scanner object, releasing the resources associated with it. It's good practice to close scanners or other resources 
        //when they are no longer needed.
    }  //end of the main method
}  //end of the TemperatureConverter class
