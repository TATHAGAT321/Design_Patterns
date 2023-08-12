package Observer;

public class PhoneObserver implements Customer{
    NotificationSubject subject;
    String phoneNumber;

    public PhoneObserver(String phone, NotificationSubject sub) {
        this.subject = sub;
        this.phoneNumber = phone;
    }
    @Override
    public void update() {
        System.out.println("Hurry Up!! New Stocks has arrived ");
        sendMessage();
    }
    public void sendMessage() {
        System.out.println("Message sent to: " + phoneNumber);
    }
}
