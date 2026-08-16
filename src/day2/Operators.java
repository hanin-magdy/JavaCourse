package day2;

public class Operators {
    // Arithmetic operators +  -  *  /  %
    static void main() {
//        int a =20,b =10;
//        System.out.println("The sum of a and b is "+(a+b));
//        System.out.println("The substraction of a and b is "+(a-b));
//        System.out.println("The multi of a and b is "+(a*b));
//        System.out.println("The division of a and b is "+(a/b));
//        System.out.println("The remainder of a and b is "+(a%b));
    // Relational/Comparison operators > >= < <= == !=
//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a<b);
//        System.out.println(a<=b);
//        System.out.println(a==b);
//        System.out.println(a!=b);
    // Logiacal Operators && || !=
//        boolean x= true,y= false;
//        System.out.println(x&&y);
//        System.out.println(x||y);
//        System.out.println(!x);
//        System.out.println(!y);
    // Increment & Decrement Operators ++ --
//        int a= 10;
//        int b= a++;
//        System.out.println(a);
//        System.out.println(b);
//        b=++a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(b++);
//        System.out.println(b++);
//        System.out.println(++b);
//        System.out.println(--b);

    // Assignment
//        int a= 10;
//        int b= a;
//        a+=10; //a=a+10
//        a-=10; //a=a-10
//        a*=10; //a=a*10
//        a/=10; //a=a/10
//        a%=10; //a=a%10
//        System.out.println(a);
        // Codition/ternary operator
        // var = exp? true : false
//        int a =20,b=30;
//        int c = a>b ? a : b;
//        System.out.println(c);
        int age= 19;
//        String vote = age>18? "Eligable":"Not Eligable";
//        System.out.println(vote);
        String vote = null;
        if(age>18){
            vote = "Eligable";
        }
        else{
            vote = "Not Eligable";
        }
        System.out.println(vote);
    }
}
