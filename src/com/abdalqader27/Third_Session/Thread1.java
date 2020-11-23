package com.abdalqader27.Third_Session;

import java.util.stream.IntStream;

public class Thread1 extends Thread {
    @Override
    public void run() {
        IntStream.range(1, 10).forEach(i -> {
            while (!Shared.isThread1) ;
            Shared.number = i;
            Shared.isThread1 = false;

            try {
                sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
