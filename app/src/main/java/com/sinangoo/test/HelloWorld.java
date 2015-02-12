package com.sinangoo.test;

import com.google.common.collect.LinkedListMultimap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class HelloWorld {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorld.class);
    private final LinkedListMultimap<String, String> mStuff;

    public HelloWorld() {
        LOGGER.debug("constructor");
        LOGGER.debug("setupMultiMap");
        mStuff = LinkedListMultimap.create();
    }

    public void put(String key, String value) {
        LOGGER.debug("add key:>" + key + "< value:>" + value + "<");
        mStuff.put(key, value);
    }

    public String toString() {
        String representation = "{";
        for(String key: mStuff.keySet()) {
            representation += "\"" + key + "\": [";
            for(String value: mStuff.get(key)) {
                representation += "\"" + value + "\",";
            }
            representation += "]";
        }
        return representation;
    }

}
