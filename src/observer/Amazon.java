package observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {

    List<OrderPlacedSubscribers> orderPlacedSubscribersList;

    public Amazon() {
        this.orderPlacedSubscribersList = new ArrayList<>();
    }

    public void addSubscriber(OrderPlacedSubscribers orderPlacedSubscriber){
        orderPlacedSubscribersList.add(orderPlacedSubscriber);
    }

    public void removeSubscriber(OrderPlacedSubscribers orderPlacedSubscriber){
        orderPlacedSubscribersList.remove(orderPlacedSubscriber);
    }

    public void placeOrder(){
        for(OrderPlacedSubscribers o: orderPlacedSubscribersList){
            o.orderPlaced();
        }
    }
}
