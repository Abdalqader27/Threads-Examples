package com.abdalqader27.Five_Session;


import java.util.stream.IntStream;

public class Player1 extends Thread {
    Share s;

    Player1(Share s) {
        this.s = s;

    }

    @Override
    public void run() {
        final int[] x = {0};
        IntStream.range(0, 3).forEach(i -> {
            x[0] = ((int) (Math.random() * 6) + 1);
            if (x[0] > 3) {
//
// peterson
//                s.t2WantToEnter = true;
//                s.favourite = 1;
//                while (s.t1WantToEnter && s.favourite == 1) ;
//                s.Increment();
//                s.t2WantToEnter = false;



                s.t1WantToEnter = true;
                while (s.t2WantToEnter)
                    if (s.favourite == 2) {
                        s.t1WantToEnter = false;
                        while (s.favourite == 2) ;
                        s.t1WantToEnter = true;

                    }
                s.Increment();
                s.favourite = 2;
                s.t1WantToEnter = false;
            }


        });
    }
}
