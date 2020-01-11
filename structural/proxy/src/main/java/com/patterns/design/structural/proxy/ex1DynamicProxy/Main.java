package com.patterns.design.structural.proxy.ex1DynamicProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Proxy;
import java.util.Map;

public class Main {
    private static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        //init object
        Map proxyInstance = (Map) Proxy.newProxyInstance(
                Map.class.getClassLoader(),
                new Class[]{Map.class},
                new DynamicInvocationHandler());

        //run invoke()
        proxyInstance.put("hello", "world");

        //run invoke()
        LOGGER.info("return: " + Integer.toString((Integer) proxyInstance.get("hello")));

    }
}

/*
Simply put, proxies are fronts or wrappers that pass function invocation through their own facilities
(usually onto real methods) – potentially adding some functionality.

Dynamic proxies allow one single class with one single method to service multiple method calls to
arbitrary classes with an arbitrary number of methods. A dynamic proxy can be thought of as a kind of
Facade, but one that can pretend to be an implementation of any interface. Under the cover,
it routes all method invocations to a single handler – the invoke() method.

While it's not a tool meant for everyday programming tasks,
dynamic proxies can be quite useful for framework writers.
It may also be used in those cases where concrete class implementations won't be known until run-time.

This feature is built into the standard JDK, hence no additional dependencies are required.

(In this implementation, original method from Map object will never run)
output:

17:53:13.402 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - Invoked method: put
17:53:13.406 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - parameter count: 2
17:53:13.408 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - proxy classcom.sun.proxy.$Proxy11
17:53:13.425 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - arg: String hello
17:53:13.425 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - arg: String world
17:53:13.425 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - Invoked method: get
17:53:13.426 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - parameter count: 1
17:53:13.426 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - proxy classcom.sun.proxy.$Proxy11
17:53:13.426 [main] ERROR com.patterns.design.structural.proxy.ex1DynamicProxy.DynamicInvocationHandler - arg: String hello
17:53:13.427 [main] INFO  com.patterns.design.structural.proxy.ex1DynamicProxy.Main - return: 41

 */