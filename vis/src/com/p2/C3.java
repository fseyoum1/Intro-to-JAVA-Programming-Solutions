package com.p2;

import com.p1.C1;

public class C3 {

    void aMethod() {

        C1 obj = new C1();


        //access c1.x since it is public
        int ableAccessX = obj.x;


        //cannot access since it is defalut(package private & private)
        /*
        int notabletoaccessY = obj.Y; it is default
        int notabletoaccessZ = obj.Z; it is private
        */

        //obj.m2(); cannot access it since default
        obj.m1(); // public can access it
        //obj.m3(); // private cannot access it

    }



}
