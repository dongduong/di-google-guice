package com.dongduong.di_google_guice.services;

public class MockMessageService implements MessageService {

	public boolean sendMessage(String msg, String receipient) {
		return true;
	}

}
