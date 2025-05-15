package Low_level_design.ObserverDesignPattern;

import Low_level_design.ObserverDesignPattern.Observable.IPhoneObservable;
import Low_level_design.ObserverDesignPattern.Observable.StockObservable;
import Low_level_design.ObserverDesignPattern.Observer.EmailObserver;
import Low_level_design.ObserverDesignPattern.Observer.MobileObserver;
import Low_level_design.ObserverDesignPattern.Observer.StockObserver;

public class Stock {
    public static void main(String[] args) {

        StockObservable IphoneObj = new IPhoneObservable();

        StockObserver stockObserver1 = new EmailObserver(IphoneObj, "abhijeet@gmail.com");
        StockObserver stockObserver2 = new EmailObserver(IphoneObj, "deepak@gmail.com");
        StockObserver stockObserver3 = new MobileObserver(IphoneObj, "+919529592242");

        IphoneObj.add(stockObserver1);
        IphoneObj.add(stockObserver2);
        IphoneObj.add(stockObserver3);

        IphoneObj.setStockCount(10);
        IphoneObj.setStockCount(0);
        IphoneObj.setStockCount(100);
        System.out.println(IphoneObj.getStockCount());

    }
}
