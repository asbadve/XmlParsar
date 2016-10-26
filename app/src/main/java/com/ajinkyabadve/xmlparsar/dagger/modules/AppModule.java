package com.ajinkyabadve.xmlparsar.dagger.modules;


import com.ajinkyabadve.xmlparsar.WeatherApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    WeatherApi providePostsApi() {
        return new WeatherApi();
    }

}
