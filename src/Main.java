import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Creating  a scanner object
        Scanner sc = new Scanner(System.in);

        //Accepting user input
        System.out.println("Enter unit one");
        String unit1 = sc.next().toLowerCase();
        System.out.println("Enter unit two");
        String unit2 = sc.next().toLowerCase();
        System.out.println("Enter unit three");
        double unit3 = sc.nextDouble();



        double feetToMeters = 0.3048;
        double poundToKgs = 0.45359237;

        if (unit1.equals("feet") && unit2.equals("meters")) {
            double results = unit3 * feetToMeters;
            System.out.println(unit3 + " feet is equal to " + results + " meters");
        } else if (unit1.equals("pound") && unit2.equals("kg")) {
            double results = unit3 * poundToKgs;
            System.out.println(unit3 + " pounds is equal to " + results + " kilograms");
        } else if (unit1.equals("fahrenheit") && unit2.equals("celsius")) {
            double results = (unit3 - 32) / 1.8;
            System.out.println(unit3 + " Fahrenheit is equal to " + results + " Celsius");
        } else {
            System.out.println("Valid units for conversion.");
        }
    }
}





