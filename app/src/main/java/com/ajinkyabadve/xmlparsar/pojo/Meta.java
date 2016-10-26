package com.ajinkyabadve.xmlparsar.pojo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Ajinkya on 26-10-2016.
 */
@Root(name = "meta")
public class Meta {
    @Element(name = "calctime")
    private double calctime;

}
