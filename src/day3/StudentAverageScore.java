package day3;

import java.util.Scanner;

public class StudentAverageScore {
    static void main() {

        int numberOfStudents = 3;
        int numberOfCourses = 4;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfCourses; j++) {

                System.out.println("Please enter score for course " + (j + 1) + "for stydent " + (i + 1));
                double score = scanner.nextDouble();
                total += score;

            }
            double average = total / numberOfCourses;
            System.out.println("The average score of student " + (i + 1) + " is" + average);
        }
        scanner.close();
    }
}
