package com.abdalqader27.Fourth_Session;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Player2 extends Thread {
    Share s;

    Player2(Share s) {
        this.s = s;

    }

    @Override
    public void run() {
        final int[] x = {0};
        IntStream.range(0, 10).forEach(i -> {
                    x[0] = ((int) (Math.random() * 2));
                    if (x[0] == 1) {
                        s.setTag2Inside(true);
                        while (s.isTag1Inside()) ;
//                        s.setTag2Inside(true);
                        s.increment();
                        s.setTag2Inside(false);

                    }
                    System.out.println("Player2-> " + this.getName() + "  " + Arrays.toString(x));

//            try {
//                //        sleep(5000);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                }


        );

    }
}
