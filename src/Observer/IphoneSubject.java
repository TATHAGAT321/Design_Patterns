package Observer;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;

public class IphoneSubject implements NotificationSubject {
    public List<Customer> customers = new ArrayList<Customer>();
    public int stocks;
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }
    @Override
    public void remove(Customer customer) {
        customers.remove(customer);
    }
    @Override
    public void notifyObservers(){
        for(Customer customer: customers) {
            customer.update();
        }
    }
    @Override
    public void setStocks(int stocks) {
        if(stocks > 0)
            notifyObservers();
        this.stocks += stocks;
    }

    public int getStocks() {
        return this.stocks;
    }
}
