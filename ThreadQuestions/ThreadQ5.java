package Questions.ThreadQuestions;
/*Create three threads- with different priorities –
MAX, MIN, NORM- and start the threads at the same time. O
bserve the completion of the threads. */
class Th1 extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }
}
class Th2 extends Thread{
    public void run(){
        System.out.println("Thread 2");
    }
}
class Th3 extends Thread{
    public void run(){
        System.out.println("Thread 3");
    }
}
public class ThreadQ5 {
    public static void main(String[] args) {
        Th1 t1=new Th1();
        Th2 t2=new Th2();
        Th3 t3=new Th3();
        t1.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
