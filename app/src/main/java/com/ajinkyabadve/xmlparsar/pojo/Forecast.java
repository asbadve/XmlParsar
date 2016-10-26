package com.ajinkyabadve.xmlparsar.pojo;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Ajinkya on 26-10-2016.
 */
@Root(name = "forecast",strict = false)
public class Forecast {
    @ElementList(name = "time", inline = true)
    private List<WTime> wTimes;

}
