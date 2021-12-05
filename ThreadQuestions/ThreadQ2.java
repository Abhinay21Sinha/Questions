package Questions.ThreadQuestions;

import java.util.Random;

/*store colours in the form of an array
ex: String colours[]={"white","blue","black","green","red","yellow"};
display all colours repeatedly by generating colour index from Random class. If the random colour index matches to red stop display.
Note: perform this task by implementing Runnabe interface*/
class mythread implements Runnable{
    public void run(){
        String[] a={"white","blue","black","green","red","yellow"};
        Random r=new Random();
        while(true){
            int t=r.nextInt(6);
            if(a[t].equals("red"))
                break;
            else
                System.out.println(a[t]);
        }
    }
}
public class ThreadQ2 {
    public static void main(String[] args) {
        mythread m=new mythread();
        m.run();
    }
}
