package com.dongduong.di_google_guice;

import com.dongduong.di_google_guice.consumer.MyApplication;
import com.dongduong.di_google_guice.injector.AppInjector;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Example Google Guice
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Injector injector = Guice.createInjector(new AppInjector());
       
       MyApplication app = injector.getInstance(MyApplication.class);
       app.sendMessage("Hi DongDuong", "dhdong1510@gmail.com");
    }
}
