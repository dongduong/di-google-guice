package com.dongduong.di_google_guice.injector;

import com.dongduong.di_google_guice.services.EmailService;
import com.dongduong.di_google_guice.services.FacebookService;
import com.dongduong.di_google_guice.services.MessageService;
import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	@Override
	protected void configure() {
		// bind the service to implementation class
//		bind(MessageService.class).to(EmailService.class);
		
		// bind MessageService to  Facebook Message implementation
		bind(MessageService.class).to(FacebookService.class);
	}

}
