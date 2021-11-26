package edu.ib;

public class ThreadDemo  implements Runnable{
    private  String threadName;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for(int i=0; i<100000; i++) System.out.println(threadName +": " + i);

    }
}
