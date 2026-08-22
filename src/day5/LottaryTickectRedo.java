package day5;

import java.util.Arrays;
import java.util.Random;

public class LottaryTickectRedo {
    private static final int LENGTH = 6;
    private static int MAX_TICKET_NUMBER = 69;
    static void main() {
        int[] ticket = generateTicketNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
        System.out.println();
        int index = Arrays.binarySearch(ticket,10);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at position"+(index+1));
        }
    }

    public static int[] generateTicketNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            int randomNumber;
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket,randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }
    public static void printTicket(int[] ticket) {
        for (int number : ticket) {
            System.out.print(number + "|");
        }
    }

    /**
     * This method search through an array sequantially
     * @param ticket array to search through
     * @param number number to search for
     * @return true if found and false if found
     */
    public static boolean search(int [] ticket, int number){
        for(int value : ticket){
            if(value==number){
                return true;
            }
        }
        return false;
    }
}
