package ThreadQuestions;

import Questions.Shape127;

class Scooby extends Thread{
    @Override
    public void run(){
        System.out.println("Scooby thread");
    }
}

class Shaggy extends Thread{
    @Override
    public void run(){
        System.out.println("Shaggy thread");
    }
}
public class ThreadQ1 {
    public static void main(String[] args) {
        Scooby t=new Scooby();
        Shaggy t1=new Shaggy();
        t1.start();
        t.start();
    }
}
