package com.cmhy.observer;

import org.junit.Test;

import com.cmhy.observer.impl.ObserverImpl;
import com.cmhy.observer.impl.SubjectImpl;
import com.cmhy.observer.inter.Observer;
import com.cmhy.observer.inter.Subject;

public class ObserverTest {
	@Test
	public void ObserverTest(){
		Subject subject = new SubjectImpl();
		Observer observer1 = new ObserverImpl();
		Observer observer2 = new ObserverImpl();
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.notifyObserve();
		
	}
}
