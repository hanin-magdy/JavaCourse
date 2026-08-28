package day7;

public class Zoo {
    static void main() {
//        Dog dog = new Dog();
//        dog.makeSound();
//        Animal animal = new Animal();
//        animal.makeSound();

        Animal animal = new Dog();
        animal.makeSound();
        ((Dog)animal).bite();

        feed(animal);

        animal = new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();

        feed(animal);
    }
    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here Is your dog food");
        }
        else{
            System.out.println("Here Is your cat food");
        }
    }
//    Animal a;
//    if(userChoice==1){
//        a = new Dog();
//    }else{
//        a = new Cat();
//    }
}
