package ru.alexpetrik;

import android.app.Application;

public class App extends Application {
    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        netComponent = DaggerNetComponent.builder()
//                .appModule()
    }

    public NetComponent getNetComponent() {
        return netComponent;
    }
}
