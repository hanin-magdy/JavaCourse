package day3;

import java.util.Scanner;

public class Cashier {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of items");
        int numberOfItems = scanner.nextInt();
        double total =0;
        for(int i=0;i<numberOfItems;i++){
            System.out.println("Enter the cost of item "+(i+1));
            double price = scanner.nextDouble();
            total+=price;
        }
        System.out.println("The total price is "+total);
        scanner.close();
    }
}
