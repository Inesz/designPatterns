package com.patterns.design.structural.flyweight.ex1;

import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {

    private static Map<Color, Vehicle> vehiclesCache = new HashMap<>();

    /**
     * Private constructor to prevent this class instantiation.
     */
    private VehicleFactory() {
    }

    public static Vehicle createVehicle(Color color) {
        Vehicle vehicle = vehiclesCache.computeIfAbsent(color, newColor ->
                new SpecificVehicle(Engine.GAS, color));

        System.out.println("VehiclesCache size: " + vehiclesCache.size());
        return vehicle;
    }
}