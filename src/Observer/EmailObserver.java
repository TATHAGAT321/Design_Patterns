package Observer;

public class EmailObserver implements Customer{
    NotificationSubject subject;
    String emailId;

    public EmailObserver(String email, NotificationSubject sub) {
        this.subject = sub;
        this.emailId = email;
    }
   @Override
    public void update() {
        System.out.println("Hurry Up!! New Stocks has arrived");
        sendMail();
    }
    public void sendMail() {
        System.out.println("Mail sent to: " + emailId);
    }
}
