package com.ajinkyabadve.xmlparsar;

import com.ajinkyabadve.xmlparsar.pojo.WeatherData;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Ajinkya on 26-10-2016.
 */

public class WeatherApi {

    String BASE_URL = "http://api.openweathermap.org/data/2.5/forecast/";

    private interface PostService {
        @GET("daily")
        Observable<WeatherData> getWeatherForeCastByCity(@Query("q") String city, @QueryMap Map<String, String> options);
    }


    public Observable<WeatherData> getWeatherInXml(String city, Map<String, String> options) {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build().create(PostService.class).getWeatherForeCastByCity(city, options);
    }


}
