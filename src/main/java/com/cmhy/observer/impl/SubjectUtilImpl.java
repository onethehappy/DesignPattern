package com.cmhy.observer.impl;

import java.util.Observable;

public class SubjectUtilImpl extends Observable{
	public void setMessage(Object arg){
		this.setChanged();
		notifyObservers(arg);
	}
}
