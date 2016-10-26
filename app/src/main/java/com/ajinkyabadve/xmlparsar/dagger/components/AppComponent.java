package com.ajinkyabadve.xmlparsar.dagger.components;


import com.ajinkyabadve.xmlparsar.MainActivity;
import com.ajinkyabadve.xmlparsar.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;


@Component(modules = {AppModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity activity);
}
