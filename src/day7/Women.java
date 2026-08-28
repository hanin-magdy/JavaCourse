package day7;

public class Women extends Person{
    private  String mentalState;

    public String getMentalState() {
        return mentalState;
    }

    public void setMentalState(String mentalState) {
        this.mentalState = mentalState;
    }

    public Women(){
        System.out.println("I am Women/* Constructor");
        setName("Hanin");
    }
}
