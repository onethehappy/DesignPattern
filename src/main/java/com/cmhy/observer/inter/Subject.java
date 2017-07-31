package com.cmhy.observer.inter;

import java.util.List;
/**
 * ±»¶©ÔÄÕß
 * @author zhangwei
 *
 */
public interface Subject {
	/**
	 * add Observer
	 * @param observer
	 */
	public void addObserver(Observer observer);
	/**
	 * delete Observer
	 * @param list
	 */
	public void deleteObserver(Observer observer);
	/**
	 * notify Observer
	 */
	public void notifyObserve();
	
}
