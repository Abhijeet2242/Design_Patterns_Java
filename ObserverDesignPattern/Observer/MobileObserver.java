package Low_level_design.ObserverDesignPattern.Observer;

import Low_level_design.ObserverDesignPattern.Observable.StockObservable;

public class MobileObserver implements StockObserver{
    String mobileNo;
    StockObservable obj;

    public MobileObserver(StockObservable obj, String mobileNo) {
        this.obj = obj;
        this.mobileNo = mobileNo;
    }

    @Override
    public void update() {
        sendMessage(mobileNo, "stock ends....");
    }
    private void sendMessage(String mobileNo, String msg) {
        System.out.println("message sent to : " + mobileNo);
        System.out.println(msg);
    }
}
