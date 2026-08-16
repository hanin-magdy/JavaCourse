package day2;

import java.util.Scanner;

public class CoditionalStatement {
    static void main() {
        //Exambel1
//        int age = 18;
//        if(age>=18){
//            System.out.println("Eligable for vote");
//        }
//        else{
//            System.out.println("Not Eligable for vote");
//        }

        //Examble2
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to check");
//        int number =scanner.nextInt();
//        if(number%2==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }
//        scanner.close();

        //Examble3
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number to check");
//        int number = scanner.nextInt();
//        if(number>0){
//            System.out.println("Positive");
//        }
//        else if (number<0){
//            System.out.println("Negative");
//        }
//        else {
//            System.out.println("Zero");
//        }
//        scanner.close();
        //Example4
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter First number");
//        int number1 = scanner.nextInt();
//        System.out.println("Enter Second number");
//        int number2 = scanner.nextInt();
//        System.out.println("Enter Third number");
//        int number3 = scanner.nextInt();
//        if(number1>number2&&number1>number3){
//            System.out.println("First number is the largest");
//        }
//        else if(number2>number1&&number2>number3){
//            System.out.println("Second number is the largest");
//        }
//        else{
//            System.out.println("Third number is the largest");
//        }
//        scanner.close();
        //Example5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day number");
        int dayNumber = scanner.nextInt();
//        if(dayNumber==1){
//            System.out.println("Sunday");
//        }
//        else if(dayNumber==2){
//            System.out.println("Monday");
//        }
//        else if(dayNumber==3){
//            System.out.println("Tuesday");
//        }
//        else if(dayNumber==4){
//            System.out.println("Wednesday");
//        }
//        else if(dayNumber==5){
//            System.out.println("Thursday");
//        }
//        else if(dayNumber==6){
//            System.out.println("Friday");
//        }
//        else if(dayNumber==7){
//            System.out.println("Saturday");
//        }
//        else {
//            System.out.println("Invalid Day Number");
//        }
        switch (dayNumber){
            case 1: System.out.println("Sunday");break;
            case 2: System.out.println("Monday");break;
            case 3: System.out.println("Tuesday");break;
            case 4: System.out.println("Wednesday");break;
            case 5: System.out.println("Thursday");break;
            case 6: System.out.println("Friday");break;
            case 7: System.out.println("Saturday");break;
            default:
                System.out.println("Invalid number");
        }
        scanner.close();
    }
}
