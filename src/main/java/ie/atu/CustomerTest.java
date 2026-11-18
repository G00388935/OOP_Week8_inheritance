package ie.atu;

public class CustomerTest {
    public static void main(String[] args) {
        Customer first =  new Customer("paul","gort","999999999",312,true);
        System.out.println(first);

        Customer second =  new Customer();
        second.setName("pete");
        second.setAddress("dublin");
        second.setPhoneNumber("1111111111");
        second.setCustomerNumber(43);
        second.setMailingList(true);

        System.out.println(second);
    }
}
