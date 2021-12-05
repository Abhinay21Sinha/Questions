package Questions.ThreadQuestions;
/*Create two threads, one thread to display all even numbers between 1 & 20,
another to display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers
Hint: use join*/
class Even extends Thread{
    public void run(){
        for(int i=2;i<=20;i+=2)
            System.out.println(i);
    }
}

class Odd extends Thread{
    public void run(){
        for(int i=1;i<=20;i+=2)
            System.out.println(i);
    }
}
public class ThreadQ4 {
    public static void main(String[] args) throws InterruptedException{
        Even e=new Even();
        Odd o=new Odd();
        e.start();
        e.join();
        o.start();
    }
}
