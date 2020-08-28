package com.dongduong.di_google_guice;

import com.dongduong.di_google_guice.consumer.MyApplication;
import com.dongduong.di_google_guice.services.MessageService;
import com.dongduong.di_google_guice.services.MockMessageService;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public AppTest( String testName ) throws Exception
    {
        super( testName );
        setUp();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }
    
    private Injector injector;

    public void testApp()
    {
    	MyApplication appTest = injector.getInstance(MyApplication.class);
        assertTrue( appTest.sendMessage("Hi DongDuong, this is unit test on Guice", "test@gmail.com") );
    }
    
    
    
    public void setUp() throws Exception {
    	injector = Guice.createInjector(new AbstractModule() {
			
			@Override
			protected void configure() {
				bind(MessageService.class).to(MockMessageService.class);
			}
		});
    }
}
