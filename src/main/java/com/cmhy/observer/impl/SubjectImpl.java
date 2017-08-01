package com.cmhy.observer.impl;

import java.util.ArrayList;
import java.util.List;

import com.cmhy.observer.inter.Observer;
import com.cmhy.observer.inter.Subject;
/**
 * subject impl
 * @author zhangwei
 *
 */
public class SubjectImpl implements Subject{
	public List<Observer> list = new ArrayList<Observer>();
	public int cnt;
	public synchronized void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		if(observer == null){
			throw new NullPointerException();
		}
		if (!list.contains(observer)) {
			list.add(observer);
		}
	}

	public synchronized void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	public void notifyObserve() {
		// TODO Auto-generated method stub
		synchronized(this){
			for (Observer observer : list) {
				observer.update((new Integer(cnt++)).toString());
			}	
		}
	}

}
