package com.example.backendlessmap;

import android.app.Application;

import com.backendless.Backendless;

public class
ApplicationClass extends Application
{
    public static final String SERVER_URL = "https://api.backendless.com ";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), "3E2F2D24-E2AF-531A-FFE8-4F32B72E3A00", "A2C50E5C-5C01-4C45-97EA-7C6380EC7261");


    }
}
