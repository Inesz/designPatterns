package com.patterns.design.structural.proxy.ex1DynamicProxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicInvocationHandler implements InvocationHandler {

    private static Logger LOGGER = LoggerFactory.getLogger(DynamicInvocationHandler.class);

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        LOGGER.error("Invoked method: {}", method.getName());
        LOGGER.error("parameter count: {}", Integer.toString(method.getParameterCount()));
        LOGGER.error("proxy class" + proxy.getClass().getName());

        for (Object a:args) {
            LOGGER.error("arg: " + a.getClass().getSimpleName() + " " + a);
        }

        return 40 + method.getParameterCount();
    }
}
