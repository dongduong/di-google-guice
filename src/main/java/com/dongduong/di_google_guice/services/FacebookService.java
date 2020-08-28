package com.dongduong.di_google_guice.services;

import javax.inject.Singleton;

@Singleton
public class FacebookService implements MessageService {

	public boolean sendMessage(String msg, String receipient) {
		System.out.println("Message sent to Facebook user " + receipient + " with message=" + msg);
		return true;
	}

}
