package com.optimize.design_model.observer;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 20:17
 */
public class ConcreteObserver implements IObserver{
    @Override
    public void update(Event event) {
        System.out.println("receive information");
    }
}
