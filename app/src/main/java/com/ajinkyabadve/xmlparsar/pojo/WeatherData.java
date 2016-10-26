package com.ajinkyabadve.xmlparsar.pojo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ajinkya on 26-10-2016.
 */
@Root(name = "weatherdata", strict = false)
public class WeatherData {
    @Element(name = "location")
    private Location location;
    @Element(name = "forecast")
    private Forecast forecast;


}
