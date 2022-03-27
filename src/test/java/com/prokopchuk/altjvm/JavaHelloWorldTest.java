package com.prokopchuk.altjvm;

import org.junit.Assert;
import org.junit.Test;

public class JavaHelloWorldTest {
    @Test
    public void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        Assert.assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
