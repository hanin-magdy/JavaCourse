package day6;

public class TextProcessor {
    static void main() {
//        countWords("I Love Route Academy And Java");
//        reverseText("Ahmed");
//        addSpace("ILoveRouteAcademyAndJava");

        // string immutable can not be changed
        String name = "      Ahmed";
        String name2 = name.trim();
        System.out.println(name);
        System.out.println(name.trim());
        System.out.println(name2);
        name = "Mohamed";
        System.out.println(name);
        // string pool
        String s1 = "Ahmed";
        String s2 = "Ahmed";
        //copy in heap
        String s3 = new String("Ahmed");
        String s4 = new String("Ahmed");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1==s3); // false
        System.out.println(s3.equals(s4)); // true
        System.out.println(s3==s4); // false

    }

    public static void countWords(String text) {
        String[] words = text.split(" ");
        String message = String.format("Your text contains %d words ", words.length);
        //System.out.println("The number of words is "+words.length);
        System.out.println(message);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseText(String text) {
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText = reversedText + text.charAt(i);
            // System.out.print(text.charAt(i));
        }
        System.out.println(reversedText);
    }

    public static void addSpace(String text) {
        StringBuilder modifiedText = new StringBuilder(text);
        for (int i =1; i < modifiedText.length(); i++) {
            if (Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
