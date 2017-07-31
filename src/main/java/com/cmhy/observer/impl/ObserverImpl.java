package com.cmhy.observer.impl;

import com.cmhy.observer.inter.Observer;
/**
 * observer impl
 * @author zhangwei
 *
 */
public class ObserverImpl implements Observer{
	/**
	 * message
	 */
	public String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void update(String message) {
		// TODO Auto-generated method stub
		setMessage(message);
		System.out.println(getMessage());
	}
}
