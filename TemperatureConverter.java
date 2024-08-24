import java.util.Scanner;

public class TemperatureConverter {
	
    public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature value: ");
        if (!sc.hasNextDouble()) { //sc.hasNextDouble() returns true if the input is a valid 
            System.out.println("Invalid input. Please enter a numeric value.");
            return; ////sc.hasNextDouble() returns true if the input is a valid 
        }
	double value = sc.nextDouble();
        System.out.println("Enter 'c' to convert Celsius to Fahrenheit");
        System.out.println("Enter 'f' to convert Fahrenheit to Celsius: ");
        String unit = sc.next().toLowerCase(); //converts the input to lowercase to handle both uppercase and lowercase inputs ('C' or 'F').
        
        switch(unit) { 
            case "c": 
                double fah = (value * 9/5) + 32; //The formula to convert Celsius to Fahrenheit.
                
                System.out.printf("Converted value in Fahrenheit: %.2f%n", fah, "F");
                break; //The break statement exits the switch block, preventing the execution of any subsequent cases.
            case "f":
                double cel = (value - 32) * 5/9; //The formula to convert Fahrenheit to Celsius.
                System.out.printf("Converted value in Celsius: %.2f%n", cel, "'C");
                break;
            default:
                System.out.println("Invalid unit. Please enter 'c' or 'f'."); //The default case handles any situation where the user input is neither "c" nor "f".
        }
        sc.close(); //releasing the resources associated with it. 
    }  
} 
