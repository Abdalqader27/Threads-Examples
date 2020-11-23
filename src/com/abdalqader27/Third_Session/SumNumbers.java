package com.abdalqader27.Third_Session;

import static java.lang.System.out;

public class SumNumbers {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
      t1.join();
        t2.join();
        out.println(Shared.Sum);

    }

}
