package com.abdalqader27.Second_Session.first_example;


import static java.lang.System.out;

public class SportClub {

    public static void main(String[] args) {
        BasketBallPlayer P1 = new BasketBallPlayer();
        BasketBallPlayer P2 = new BasketBallPlayer();

        //  Thread thread1 = new Thread(()->{}, "Player1");
        Thread thread1 = new Thread(P1, "Player1");
        Thread thread2 = new Thread(P2, "Player2");

        thread1.start();
        thread2.start();

        for (; ; ) {
            out.flush();

            if (P1.finish & P2.finish) {
                out.println("Sum 1 :" + P1.sum + "   Sum2 :" + P2.sum);
                if (P1.sum < P2.sum) out.println("P1  is smaller ");
                else if (P1.sum > P2.sum) out.println("P2  is smaller ");
                else out.println(P1.sum + "\t Player1 && Player2");
                break;
            }
        }

    }

}
