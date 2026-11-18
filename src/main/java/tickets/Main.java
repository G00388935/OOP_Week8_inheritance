package tickets;

public class Main {
    public static void main(String[] args) {
        int Base = 80;

        Ticket holder1 = new Ticket("Micheal jackson concert","Alice",Base);
        Ticket holder2 = new StudentTicket("Micheal jackson concert","bob",Base,"g003333333");
        Ticket holder3 = new VIPTicket("Micheal jackson concert","Charlie",Base);
        Ticket holder4 = new EarlyBirdTicket("Micheal jackson concert","Tom",Base);


        System.out.println(holder1.toString());
        System.out.println(holder2.toString());
        System.out.println(holder3.toString());
        System.out.println(holder4.toString());

    }
}
