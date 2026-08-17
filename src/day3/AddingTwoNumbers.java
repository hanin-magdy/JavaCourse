package day3;

import java.util.Scanner;

public class AddingTwoNumbers {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do{
            System.out.println("Enter First Number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter Second Number");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("The Sum of the two numbers is"+sum);
            System.out.println("Do you want to repeat again?");
            again = scanner.nextBoolean();
        }while(again);
        scanner.close();
    }
}
