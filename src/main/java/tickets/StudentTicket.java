package tickets;

public class StudentTicket extends Ticket {
    private String studentId;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public StudentTicket() {
        super();
        this.studentId = "";
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * .8;
    }


    @Override
    public String toString() {
        return
                "Event : " + getEventName() +  '\n' + "Standard Ticket - " + getHolderName() + " €" + calculatePrice() + '\n'+
                "Student ID : " + studentId + '\n';
    }
}
