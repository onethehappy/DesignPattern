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
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}

	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(observer);
	}

	public void notifyObserve() {
		// TODO Auto-generated method stub
		for (Observer observer : list) {
			observer.update((new Integer(cnt++)).toString());
		}
	}
	
}
