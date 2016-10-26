package com.ajinkyabadve.xmlparsar.pojo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Ajinkya on 26-10-2016.
 */
@Root(name = "location")
public class Location {
    @Element(name = "name")
    private String name;
    @Element(required = false)
    private String type;
    @Element(name = "country")
    private String country;
    @Element(required = false)
    private String timezone;
    @Element(name = "location")
    private LocationAtr locationAtr;

}
