package day2;

public class SwappingNumbers {
    static void main() {
//        int a =10,b=20;
//        int tmp= a;
//        a=b;
//        b=tmp;
//        System.out.println(a);
//        System.out.println(b);
        int a=10,b=20;
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
