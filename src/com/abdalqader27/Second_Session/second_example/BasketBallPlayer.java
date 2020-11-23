package com.abdalqader27.Second_Session.second_example;

import com.abdalqader27.Second_Session.Player;

import static java.lang.System.out;

import java.util.stream.IntStream;

public class BasketBallPlayer extends Player implements Runnable {
    boolean finish = false;
    int sum = 0;

    @Override
    public void run() {

        IntStream.range(0, 10).forEach(i -> {
            int flag = (int) (Math.random() * 2);
            out.println("Flag : " + flag + "  " + Thread.currentThread());
            sum += flag;

        });

        finish = true;
    }
}
