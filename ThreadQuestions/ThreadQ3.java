package Questions.ThreadQuestions;
/*Create a thread which prints 1 to 10. After printing 5, there should be a delay
of 5000 milliseconds before printing 6.*/
class mythread2 extends Thread{
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println(i);
            if(i==5)
            { try{Thread.sleep(5000);
            }catch(InterruptedException h){
                System.out.println("Taking too much time");
            }


            }

        }
    }
}
public class ThreadQ3 {
    public static void main(String[] args) {
        mythread2 m=new mythread2();
        m.setPriority(Thread.MAX_PRIORITY);
        m.start();
    }
}
