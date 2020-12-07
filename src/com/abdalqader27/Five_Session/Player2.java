package com.abdalqader27.Five_Session;


import java.util.stream.IntStream;

public class Player2 extends Thread {
    Share s;

    Player2(Share s) {
        this.s = s;

    }

    @Override
    public void run() {
        final int[] x = {0};
        IntStream.range(0, 3).forEach(i -> {
            x[0] = ((int) (Math.random() * 6) + 1);
            if (x[0] > 3) {

//peterson
//                s.t1WantToEnter = true;
//                s.favourite = 2;
//                while (s.t2WantToEnter && s.favourite == 2) ;
//                s.Increment();
//                s.t1WantToEnter = false;


                s.t2WantToEnter = true;
                while (s.t1WantToEnter)
                    if (s.favourite == 1) {
                        s.t2WantToEnter = false;
                        while (s.favourite == 1) ;
                        s.t2WantToEnter = true;
                    }
                s.Increment();
                s.favourite = 1;
                s.t2WantToEnter = false;

            }


        });
    }
}
