package day3;

import java.util.Scanner;

public class TextProcessor {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = scanner.nextLine();
        scanner.close();
        boolean letterFound = false;
        int position=0;
        for (int i=0;i<text.length();i++){
            char currentLetter = text.charAt(i);
            if(currentLetter=='A'||currentLetter=='a'){
                position=i+1;
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("Letter A found at position "+position);
        }
        else{
            System.out.println("Letter A not found");
        }
    }
}
