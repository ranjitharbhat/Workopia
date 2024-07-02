package com.infy.springIoc.Ioc;

public class Airtel implements Sim{
	public Airtel() {
		super();
		System.out.println("air obj created");
	}
	@Override
	public void calling() {
		System.out.println("Call from airtel sim");
		
	}

	@Override
	public void browse() {
		System.out.println("browse from airtel sim");
		
	}

}
