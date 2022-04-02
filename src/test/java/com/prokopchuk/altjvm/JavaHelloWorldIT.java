package com.prokopchuk.altjvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaHelloWorldIT {

    @Test
    void integrationTest(){
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        Assertions.assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
