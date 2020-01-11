package com.patterns.design.structural.flyweight.ex1;

import javax.sound.midi.Soundbank;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args){

        Vehicle vehicleBLACK = VehicleFactory.createVehicle(Color.BLACK);
        Vehicle vehicleBLACK2 = VehicleFactory.createVehicle(Color.BLACK);

        Vehicle vehicleBLUE = VehicleFactory.createVehicle(Color.BLUE);


        System.out.println("======route 66========");
        System.out.println(vehicleBLACK.getColor() + " " + vehicleBLACK.hashCode());
        System.out.println(vehicleBLACK2.getColor() + " " + vehicleBLACK2.hashCode());
        System.out.println(vehicleBLUE.getColor() + " " + vehicleBLUE.hashCode());
        System.out.println("=====================");

    }
}

/*
output:
VehiclesCache size: 1
VehiclesCache size: 1
VehiclesCache size: 2
======route 66========
BLACK 1020923989
BLACK 1020923989
BLUE 510113906
=====================
 */