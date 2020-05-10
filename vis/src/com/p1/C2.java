package com.p1;

public class C2 {
    void aMethod2() {

        C1 obj = new C1();

        // able to access x and y
        int ableAcessX = obj.x;
        int ableAcessY = obj.y;

        // not able to access private method
        //int ableAcessZ = obj.z;

        //able to access public methods 
        obj.m1();
        obj.m2();

        //not able to access private method
        //obj.m3();

    }
}
