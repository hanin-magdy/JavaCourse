package day7;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
    public void bite(){
        System.out.println("I am a dog , I am bite");
    }
}
