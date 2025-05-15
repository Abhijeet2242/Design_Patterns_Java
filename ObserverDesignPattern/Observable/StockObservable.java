package Low_level_design.ObserverDesignPattern.Observable;

import Low_level_design.ObserverDesignPattern.Observer.StockObserver;

public interface StockObservable {
    public void add(StockObserver observer);
    public void  remove(StockObserver observer);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);
    public int getStockCount();

}
