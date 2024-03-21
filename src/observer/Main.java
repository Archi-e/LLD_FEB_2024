package observer;

public class Main {
    public static void main(String[] args) {
        CustomerNotificationService c = new CustomerNotificationService();
        InvoiceGeneratorService i = new InvoiceGeneratorService();
        Amazon amazon = new Amazon();
        amazon.addSubscriber(c);
        amazon.addSubscriber(i);

        amazon.placeOrder();

        amazon.removeSubscriber(i);

        amazon.placeOrder();
    }


}
