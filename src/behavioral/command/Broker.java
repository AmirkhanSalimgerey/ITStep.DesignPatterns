package behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void placeOrder(){
        for(Order order: orderList){
            order.execute();
        }
        orderList.clear();
    }
}
