package com.abdalqader27.Fourth_Session;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Player1 extends Thread {
    Share s;

    Player1(Share s) {
        this.s = s;

    }

    @Override
    public void run() {
        final int[] x = {0};
        IntStream.range(0, 10).forEach(i -> {
                    x[0] = ((int) (Math.random() * 2));
                    if (x[0] == 1) {
                        /// V4 Deker
                        // s.setTag1Inside(true);
                        //while(s.isTag2Inside()){
                        //  s.setTag1Inside(false);
                        // sleep((int) MAth.random()*5000)
                        //   s.increment();
                        //   s.setTag1Inside(false);
                        // }

                     /// V3
                        s.setTag1Inside(true);
                        while (s.isTag2Inside()) ;
                //        s.setTag1Inside(true);
                        s.increment();
                        s.setTag1Inside(false);
                    }
                    System.out.println("Player1-> " + this.getName() + "  " + Arrays.toString(x));

//            try {
//                        sleep(3000);
//
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }

                }


        );

    }
}
