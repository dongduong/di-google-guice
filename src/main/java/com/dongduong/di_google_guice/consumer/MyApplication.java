package com.dongduong.di_google_guice.consumer;

import javax.inject.Inject;

import com.dongduong.di_google_guice.services.MessageService;

public class MyApplication {
	private MessageService service;
	
	// constructor based injector
//	@Inject
//	public MyApplication(MessageService svc) {
//		this.service = svc;
//	}
	
	// setter method injector
	@Inject
	public void setService(MessageService svc) {
		this.service = svc;
	}
	
	public boolean sendMessage(String msg, String rec) {
		//some business logic here
		return service.sendMessage(msg, rec);
	}

}
