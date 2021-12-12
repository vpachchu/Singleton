//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Main {


    public static void main(String[] args) {

        //Testing Singleton
        System.out.println("I'm Singleton Design Pattern");
        Hostel room1= Hostel.getRoom(101);
        System.out.println("memory address of above room is "+room1);
        Hostel room2= Hostel.getRoom(102);
        System.out.println("memory address of above room is "+room2);

    }
}
