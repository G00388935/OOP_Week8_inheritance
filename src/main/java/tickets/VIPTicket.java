package tickets;

public class VIPTicket extends Ticket {

    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    public VIPTicket() {
        super();
    }

    public String getBenefits(){
        return "Priority entry and reserved seating" + "\n";
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() + 25;
    }

    @Override
    public String toString() {
        return
                "Event : " + getEventName() +  '\n' +
                        "Standard Ticket - " + getHolderName() + "  €" + calculatePrice() + '\n'
                + getBenefits();
    }
}
