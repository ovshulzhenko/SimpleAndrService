package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MyService extends Service {
    public MyService() {
    }

    IMyAidlInterface.Stub mService = new IMyAidlInterface.Stub() {
        @Override
        public int add(int x, int y) {
            return x + y;
        }
    };
    @Override
    public IBinder onBind(Intent intent) {
        return mService;
    }
}