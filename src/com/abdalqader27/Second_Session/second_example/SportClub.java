package com.abdalqader27.Second_Session.second_example;


import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.System.out;

public class SportClub implements  Runnable {

    public static void main(String[] args) {
        BasketBallPlayer P1 = new BasketBallPlayer();
        BasketBallPlayer P2 = new BasketBallPlayer();

        Thread thread1 = new Thread(P1, "Player1");
        Thread thread2 = new Thread(P2, "Player2");

        thread1.start();
        thread2.start();
        out.println(thread1);

        try {
            thread1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(thread1.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(thread2.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Sum1 is:" + P1.sum + "\nSum2 is:" + P2.sum);
        if (P1.sum > P2.sum) {
            System.out.println(P1.sum + "\t Player1");
        } else if (P1.sum < P2.sum) {
            System.out.println(P2.sum + "\t Player2");
        } else {
            System.out.println(P1.sum + "\t Player1 && Player2");
        }

    }

    @Override
    public void run() {
        out.flush();
        out.println("my run ");
    }
}
