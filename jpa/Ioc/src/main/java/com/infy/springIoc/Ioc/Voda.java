package com.infy.springIoc.Ioc;

public class Voda implements Sim{
	public Voda() {
		super();
		System.out.println("voda obj created");
	}
	@Override
	public void calling() {
		System.out.println("Call from voda sim");
		
	}

	@Override
	public void browse() {
		System.out.println("browse from voda sim");
		
	}

}
