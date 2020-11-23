package com.abdalqader27.Third_Session;

import java.util.stream.IntStream;

public class Thread2 extends Thread {
    @Override
    public void run() {
        IntStream.range(1, 10).forEach(i -> {
            while (Shared.isThread1) ;
                Shared.Sum += Shared.number;
                Shared.isThread1 = true;

            try {
                sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
    }
}
