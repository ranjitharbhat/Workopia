package com.infy.anno1.anno1;

public class SmsService implements MessageService {

	@Override
	public void sendm(String ms) {
		System.out.println("sending \"" +ms+"\"through mail");
	}
}
