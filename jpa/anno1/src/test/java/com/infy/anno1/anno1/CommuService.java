package com.infy.anno1.anno1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommuService {
	@Autowired
	@Qualifier("emser")
	private MessageService comm;
	public CommuService() {
		
	}
	public void startcomm(String msg)
	{
		comm.sendm(msg);
	}

}
