package com.optimize.design_model.observer;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 20:18
 */
public class Main {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.attach(observer);
        subject.inform();
    }
}
