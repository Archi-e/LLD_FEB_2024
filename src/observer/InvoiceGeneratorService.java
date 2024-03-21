package observer;

public class InvoiceGeneratorService implements OrderPlacedSubscribers{
    @Override
    public void orderPlaced() {
        System.out.println("Invoice is generated");
    }
}
