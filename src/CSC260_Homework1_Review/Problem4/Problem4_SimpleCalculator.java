package CSC260_Homework1_Review.Problem4;

import java.util.Scanner;

public class Problem4_SimpleCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== WELCOME TO YC's CALCULATOR ===");
        String isExit;

        do {
            System.out.println("Input any key to continues, \"ESC\" to exit");
            isExit = input.next();
            //Continues the program
            if (!"ESC".equalsIgnoreCase(isExit)) {
                System.out.println("");

                //Get 1st number
                System.out.print("Number: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Invalid number!");
                    System.out.print("Number: ");
                    input.next();
                }
                double a = input.nextDouble();

                //Operation menu
                System.out.println("+  -  *  /");

                //Operator input validate
                System.out.print("Operator: ");
                char operator = input.next().charAt(0);
                while (operator != '+' && operator != '-' && operator != '*'
                        && operator != '/') {
                    System.out.println("Invalid Operator!");
                    System.out.print("Operator: ");
                    operator = input.next().charAt(0);
                }

                //Get 2nd number
                System.out.print("Number: ");
                while (!input.hasNextDouble()) {
                    System.out.println("Invalid number!");
                    System.out.print("Number: ");
                    input.next();
                }
                double b = input.nextDouble();

                //Create MyCalculator Object
                MyCalculator myCal = new MyCalculator(a, b, operator);
                System.out.println(myCal);
            } else {
                //Close program
                System.out.println("");
                System.out.println("Thank you for your business ^^!");
                System.out.println("See you later !!! ");
                break;
            }
        } while (!"ESC".equalsIgnoreCase(isExit));
    }
}
