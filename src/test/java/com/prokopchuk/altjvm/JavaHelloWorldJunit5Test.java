package com.prokopchuk.altjvm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JavaHelloWorldJunit5Test {

    @Test
    void helloWorldTest() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        Assertions.assertEquals("Hello World", javaHelloWorld.getHello());
    }
}
