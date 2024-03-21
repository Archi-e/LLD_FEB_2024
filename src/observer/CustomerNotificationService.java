package observer;

public class CustomerNotificationService implements OrderPlacedSubscribers{
    @Override
    public void orderPlaced() {
        System.out.println("Send SMS");
        System.out.println("Order is placed");
    }
}
