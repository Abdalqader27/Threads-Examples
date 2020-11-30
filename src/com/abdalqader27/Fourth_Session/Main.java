package com.abdalqader27.Fourth_Session;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Share share = new Share();
        Player1 player1 = new Player1(share);
        Player2 player2 = new Player2(share);
        player1.start();
        player2.start();

        try {
            player1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            player2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.println(share.getScore());


    }
}
