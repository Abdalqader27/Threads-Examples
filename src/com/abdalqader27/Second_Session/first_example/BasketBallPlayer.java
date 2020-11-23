package com.abdalqader27.Second_Session.first_example;

import com.abdalqader27.Second_Session.Player;

import static java.lang.System.out;

import java.util.stream.IntStream;

public class BasketBallPlayer extends Player implements Runnable {
    boolean finish = false;
    int sum = 0;

    @Override
    public void run() {

//        IntStream.range(0, 10).forEach(i -> {
//            int flag = (int) (Math.random() * 2);
//            out.println("Flag : " + flag + "  " + Thread.currentThread());
//            sum += flag;
//
//        });
        for (int i = 0; i < 10; i++)
        {
            int flag = (int) (Math.random() * 2);
            System.out.println("Flag : " + flag + "  " + Thread.currentThread().getName());
            sum += flag;
        }
        finish = true;
    }
}
