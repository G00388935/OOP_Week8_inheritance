package tickets;

public class EarlyBirdTicket extends Ticket {
    public EarlyBirdTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    public EarlyBirdTicket() {
        super();
    }

    @Override
    public double calculatePrice() {
        if(getBasePrice()<10)
        {
            return 0;
        }
        {
            return getBasePrice() - 10;
        }
    }

    @Override
    public String toString() {
        return
                "Event : " + getEventName() +  '\n' +
                        "Standard Ticket - " + getHolderName() + "  €" + calculatePrice() + '\n';
    }

}
