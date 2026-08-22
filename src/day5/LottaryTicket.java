package day5;

import java.util.Random;

public class LottaryTicket {
    // const field
    private static final int LENGTH = 6;
    private static int MAX_TICKET_NUMBER = 69;
    static void main() {
        int[] ticket = generateTicketNumbers();
        printTicket(ticket);
    }

    public static int[] generateTicketNumbers() {
        int[] ticket = new int[LENGTH];
        Random random = new Random();
        for (int i = 0; i < ticket.length; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER);
        }
        return ticket;
    }
    public static void printTicket(int[] ticket) {
        for (int number : ticket) {
            System.out.print(number + "|");
        }
    }
//    public static boolean search(int [] ticket, int number){
//        for(int value : ticket){
//            if(value==number){
//                return true;
//            }
//        }
//        return false;
//    }
}