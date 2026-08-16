package day2;

import java.util.Scanner;

public class EmployeeGrossPay {
    static void main() {
        // What we have
        int rate = 15;
        int maxHoursPerWeek = 40;
        // What we need
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your working hours");
        int workedHours = scanner.nextInt();
        while (workedHours>maxHoursPerWeek){
            System.out.println(" Please Enter Number between 1 and 40");
            workedHours = scanner.nextInt();
        }
        int grossPay = workedHours*rate;
        System.out.println("Your gross salary is "+grossPay+" $");
        scanner.close();
    }
}
