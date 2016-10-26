package com.ajinkyabadve.xmlparsar.pojo;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Ajinkya on 26-10-2016.
 */
@Root(name = "symbol",strict = false)
public class Symbol {
    @Attribute(name = "number")
    private String number;
}
