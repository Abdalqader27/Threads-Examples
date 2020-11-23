package com.abdalqader27.First_Session;


import static java.lang.System.*;

public class Main extends Thread{


    public static void main(String[] args) {

        out.println("Welcome \n Java\n");
        CountThread fThread = new CountThread(1, 10, "FirstThread");
        CountThread sThread = new CountThread(11, 20, "SecondThread");
        out.println("Hi \n Thread\n");
        fThread.start();
        sThread.start();

        // fThread.run();
        //   sThread.run(); or Run() => 'Nothing to do'


        out.print("bye \n Thread\n");
        out.println("Thread1 Name  is : " + fThread.getName());
        out.println("Thread2 Name is : " + sThread.getName());

        out.println("Thread1 id  is : " + fThread.getId());
        out.println("Thread2 id is : " + sThread.getId());

        if (fThread.isDaemon()) out.println("First Thread is Daemon");
        if (sThread.isDaemon()) out.println("Second Thread is Daemon");

        // if you want to set piroirty

//        fThread.setPriority(9);
        out.println("Thread1 priority  is : " + fThread.getPriority());
        out.println("Thread2 priority is : " + sThread.getPriority());

        out.println("Main Current Thread is : " + Thread.currentThread());
        /// you can use Thread.currentThread()

    }

}

