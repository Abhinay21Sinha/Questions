package Questions;
/*Design a java program to display the number of instances created so far of a specific class.*/
public class Sample20 {
    int roll;
    String ename;
    static int count;        //Taking static variable
    {
        count++;             //Using instance block
    }
    Sample20(){
        roll=90;
        ename="Unknown";
    }
}

class Test7{
    public static void main(String[] args) {
        Sample20 s1,s2,s3,s4;
        s1=new Sample20();
        s2=new Sample20();
        s3=new Sample20();
        s4=new Sample20();
        System.out.println("Number of instances is "+Sample20.count);    //accessing Static variable using class name
    }
}
