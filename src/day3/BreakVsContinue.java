package day3;

public class BreakVsContinue {
    static void main() {
        for(int i =1;i<=10;i++) {
            if (i == 5||i==6||i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
