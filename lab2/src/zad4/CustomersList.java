package zad4;

public class CustomersList {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setLanguage(new Polish());
        customer1.setTransmission(new Email());
        Customer customer2 = new Customer();
        customer2.setLanguage(new Spanish());
        customer2.setTransmission(new ReadBySynthesizer());
        Customer customer3 = new Customer();
        customer3.setLanguage(new Polish());
        customer3.setTransmission(new Sms());
        Customer customer4 = new Customer();
        customer4.setLanguage(new Spanish());
        customer4.setTransmission(new Email());
    }
}
