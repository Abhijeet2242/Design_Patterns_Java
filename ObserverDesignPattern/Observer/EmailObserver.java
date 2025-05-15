package Low_level_design.ObserverDesignPattern.Observer;

import Low_level_design.ObserverDesignPattern.Observable.StockObservable;

public class EmailObserver implements StockObserver{
    String emailId;
    StockObservable obj;
    public EmailObserver(StockObservable obj, String emailId) {
        this.obj = obj;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock hurry up...");
    }
    private  void sendMail(String emailId, String msg) {
        System.out.println("mail sent to : " + emailId);
    }
}
