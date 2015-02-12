package com.sinangoo.test.testing;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sinangoo.test.HelloWorld;

public class HelloWorldTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test
    public void doesRespond() {
        LOGGER.debug("create hello world instance");
        HelloWorld hello = new HelloWorld();
        hello.put("a","aaa aaaa");
        hello.put("a","bbb bbb");
        hello.put("a","ccc ccc");
        LOGGER.debug("hello world string: " + hello);
    }

}
