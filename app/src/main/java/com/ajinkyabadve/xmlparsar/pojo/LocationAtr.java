package com.ajinkyabadve.xmlparsar.pojo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

/**
 * Created by Ajinkya on 26-10-2016.
 */
@Root(name = "location")
public class LocationAtr {

    @Attribute(name = "altitude")
    private double altitude;

    @Attribute(name = "latitude")
    private double latitude;

    @Attribute(name = "longitude")
    private double longitude;


    @Attribute(name = "geobase")
    private String geobase;

    @Attribute(name = "geobaseid")
    private long geobaseid;

}
