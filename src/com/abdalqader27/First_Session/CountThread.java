package com.abdalqader27.First_Session;

import static java.lang.System.out;

public class CountThread extends Thread {
    private int a, b;
    public CountThread(int a, int b, String name) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        //    for (int i = a; i <= b; ++i) out.print(i * i + " "+getName());
        for (int i = a; i <= b; ++i) out.print(" (" + i * i + ") -> " + currentThread() + "\n");

        super.run();


    }
}
