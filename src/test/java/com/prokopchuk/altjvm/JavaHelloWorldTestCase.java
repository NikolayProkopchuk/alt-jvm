package com.prokopchuk.altjvm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaHelloWorldTestCase {

    @Test
    void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        Assert.assertEquals("Hello World", javaHelloWorld.getHello());
    }

}