import java.util.Scanner;

public class CelsiusToFahrenheit {


    // FINISH: Define celsiusToFahrenheit method here

    public static double celsiusToFahrenheit(double celsius){
        double farenheit = celsius * 9/5 + 32;
        return farenheit;
    }


    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        double tempF;
        double tempC;

        System.out.println("Enter temperature in Celsius: ");
        tempC = scnr.nextDouble();

        tempF = celsiusToFahrenheit(tempC);

        System.out.print("Fahrenheit: ");
        System.out.println(tempF);
    }
}
