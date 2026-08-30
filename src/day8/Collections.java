package day8;

import java.util.*;

public class Collections {
    static void main() {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }
    public static void setDemo(){
        /**
         * set
         * HashSet - linkedHashSet - TreeSet
         */
        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple");

        fruits.remove("Apple");

        System.out.println(fruits.size());
        System.out.println(fruits);

        var i = fruits.iterator();
        //hasnext bt return true or false boolean
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for (String fruit:fruits){
            System.out.println(fruit);
        }

        fruits.forEach(x-> System.out.println(x));

        fruits.forEach(System.out::println);

    }
    public static void listDemo(){
        /**
         * list
         * ArrayList - LinkedList - Stack - Vector
         */
        List <String> fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        fruits.remove(0);
        fruits.remove("Banana");

        System.out.println(fruits.size());
        System.out.println(fruits);


        var i = fruits.iterator();
        //hasnext bt return true or false boolean
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for (String fruit:fruits){
            System.out.println(fruit);
        }

        fruits.forEach(x-> System.out.println(x));

        fruits.forEach(System.out::println);

    }
    public static void queueDemo(){
        /**
         * queue
         * linkedList - priorityQueue
         */
        Queue <String> fruits = new LinkedList();
        fruits.add("Apple");
        fruits.add("Lemon");
        fruits.add("Lemon");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        fruits.remove("Lemon");
        fruits.remove();
        fruits.remove();

        System.out.println(fruits.size());
        System.out.println(fruits);
        System.out.println(fruits.element());


        var i = fruits.iterator();
        //hasnext bt return true or false boolean
        while (i.hasNext()){
            System.out.println(i.next());
        }

        for (String fruit:fruits){
            System.out.println(fruit);
        }

        fruits.forEach(x-> System.out.println(x));

        fruits.forEach(System.out::println);

    }
    public static void mapDemo(){
        /**
         * map
         * HashMap - LinkedHashMap - TreeMap
         */
        Map<String,Integer> fruiteColories = new HashMap();
        fruiteColories.put("Apple",200);
        fruiteColories.put("Orange",80);
        fruiteColories.put("Mango",50);
        fruiteColories.putIfAbsent("Mango",100);
        fruiteColories.put("Banana",90);

        fruiteColories.remove("Apple");

        System.out.println(fruiteColories.size());
        System.out.println(fruiteColories);

        for (var entry :fruiteColories.entrySet()){
            System.out.println("The fruit "+entry.getKey() +"has "+entry.getValue()+" Calories");
        }

        //fruiteColories.forEach((x,y)-> System.out.println("The fruit "+ x+"has "+ y+" Calories"));
    }
}
