package day4;

import java.util.Scanner;

public class InstantPayCheck {
    static final double requiredSalary = 20000;
    static final double requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);
    static void main() {
        // getEmployeeInfo();
        double salary = getEmployeeSalary();
        double creditScore = getEmployeeCreditScore();
        boolean qualified = isQualified(salary,creditScore);
        scanner.close();
        notifyUser(qualified);

    }
//    static void getEmployeeInfo(){
//        System.out.println("Enter your salary");
//        double salary = scanner.nextDouble();
//        System.out.println("Enter your credit score");
//        double creditScore = scanner.nextDouble();
//        return salary,creditScore;
    static double getEmployeeSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;

    }
    static double getEmployeeCreditScore(){
        System.out.println("Enter your credit score");
        double creditScore = scanner.nextDouble();
        return creditScore;
    }

    static boolean isQualified(double salary , double creditScore){
        if(salary>requiredSalary&&creditScore>requiredCreditScore){
            return true;
        }
        else {
            return false;
        }
    }
    static void notifyUser(boolean qualified){
        if(qualified==true){
            System.out.println("Congratulations , you are qualified for the color");
        }
        else {
            System.out.println("Sorry , you are not qualified ");
        }

    }

}
