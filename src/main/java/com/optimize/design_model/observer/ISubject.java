package com.optimize.design_model.observer;

/**
 * @author: Kerwinnli
 * @date: 2023/11/27 20:10
 */
public interface ISubject {

    void attach(IObserver iObserver);      // 添加观察者

    void detach(IObserver iObserver);      // 删除观察者

    void inform();      // 通知观察者
}
