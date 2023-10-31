import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tempC;
        double tempF;
        boolean validInput = false;
        String doneInput;
        boolean doneCheck = false;

        while(!doneCheck){
            do {
                System.out.print("Please enter a temperature in Celsius to convert to Fahrenheit: ");
                if (scan.hasNextDouble()) {
                    tempC = scan.nextDouble();
                    tempF = (tempC * 1.8) + 32;
                    System.out.printf("Degrees C: %12.2f", tempC);
                    System.out.printf("\nDegrees F: %12.2f", tempF);
                    validInput = true;
                } else {
                    System.out.println("You have entered an incorrect value for temperature.  Please enter a number.");
                    scan.nextLine();
                }
            } while(!validInput);

            System.out.println();
            System.out.println("Continue? Y or N: ");
            doneInput = scan.nextLine();
            if (doneInput.equalsIgnoreCase("n")) {
                doneCheck = true;
            }
            scan.nextLine();
        }

    }
}