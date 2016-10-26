package com.ajinkyabadve.xmlparsar.dagger;


import com.ajinkyabadve.xmlparsar.dagger.components.AppComponent;
import com.ajinkyabadve.xmlparsar.dagger.components.DaggerAppComponent;
import com.ajinkyabadve.xmlparsar.dagger.modules.AppModule;

public class DaggerInjector {

    public DaggerInjector() {
    }

    private static AppComponent appComponent = DaggerAppComponent.builder().appModule(new AppModule()).build();

    public static AppComponent get() {
        return appComponent;
    }
}
