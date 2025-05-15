package Low_level_design.ObserverDesignPattern.Observable;

import Low_level_design.ObserverDesignPattern.Observer.StockObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{
    List<StockObserver> objList = new ArrayList<>();
    int stockCount;

    @Override
    public void add(StockObserver observer) {
        objList.add(observer);
    }

    @Override
    public void remove(StockObserver observer) {
        objList.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (StockObserver obj: objList) {
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if(stockCount == 0) notifySubscriber();
        stockCount += newStockCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
