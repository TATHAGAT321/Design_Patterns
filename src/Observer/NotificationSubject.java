package Observer;

public interface NotificationSubject {
    public void notifyObservers();
    public void add(Customer customer);
    public void remove(Customer customer);
    public void setStocks(int stocks);

    public int getStocks();

}
