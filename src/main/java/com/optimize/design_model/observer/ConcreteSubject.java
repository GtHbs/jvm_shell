package com.optimize.design_model.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 20:15
 */
public class ConcreteSubject implements ISubject{


    private static final List<IObserver> I_OBSERVERS = new ArrayList<>();

    @Override
    public void attach(IObserver iObserver) {
        I_OBSERVERS.add(iObserver);
    }

    @Override
    public void detach(IObserver iObserver) {
        I_OBSERVERS.remove(iObserver);
    }

    @Override
    public void inform() {
        for (IObserver iObserver : I_OBSERVERS) {
            Event event = new Event();
            iObserver.update(event);        // 在此通知观察者
        }
    }
}
