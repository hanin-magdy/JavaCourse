package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static void main() {
        createFile();

        try {
            creatFileRethrow();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello from after execpetion");

        numbersExceptionHandling();

    }
    public static void createFile(){
        File file = new File("recources/nonexist.text");
        try {
            file.createNewFile();
        }catch (IOException e){
            System.out.println("The Path does not exist");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hello From After Exception");
    }


    public static void creatFileRethrow() throws IOException {
        File file = new File("recourcees/nonexist.text");
        file.createNewFile();

    }



    public static void numbersExceptionHandling(){
        File file = new File("recources/Number.text");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNext()){
                double num = scanner.nextDouble();
                System.out.println(num);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        } catch (InputMismatchException e){
            e.printStackTrace();
        }  catch (Exception e){
            e.printStackTrace();
        }
        finally {
            scanner.close();
        }

        System.out.println("Hello from after exception");
    }
}
