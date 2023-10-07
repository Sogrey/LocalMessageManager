package top.sogrey.localmessagemanager.demo;

import android.app.Application;

import top.sogrey.localmessagemanager.LocalMessageManager;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LocalMessageManager.setDebug(true);
    }

}
