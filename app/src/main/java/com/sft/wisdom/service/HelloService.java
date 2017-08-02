package com.sft.wisdom.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.io.FileDescriptor;
import java.io.PrintWriter;

import cn.sft.util.MyHandler;
import cn.sft.util.Util;

/**
 * Created by Administrator on 2017/7/29.
 */

public class HelloService extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        Util.print("onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, final int startId) {
        Util.print("onStartCommand");

        if (intent != null) {
            Util.print("value = " + intent.getStringExtra("value"));
        } else {
            Util.print("intent = null");
        }
        new MyHandler(10000, true) {
            @Override
            public void run() {
                stopSelf(startId);
            }
        };
        return Service.START_REDELIVER_INTENT;
    }

    @Override
    public void onDestroy() {
        Util.print("onDestroy");
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Util.print("onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onLowMemory() {
        Util.print("onLowMemory");
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        Util.print("onTrimMemory");
        super.onTrimMemory(level);
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Util.print("onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        Util.print("onRebind");
        super.onRebind(intent);
    }

    @Override
    public void onTaskRemoved(Intent rootIntent) {
        Util.print("onTaskRemoved");
        super.onTaskRemoved(rootIntent);
    }

    @Override
    protected void dump(FileDescriptor fd, PrintWriter writer, String[] args) {
        Util.print("dump");
        super.dump(fd, writer, args);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Util.print("onBind");
        return null;
    }
}
