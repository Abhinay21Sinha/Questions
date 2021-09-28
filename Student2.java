package Questions;

import java.util.Scanner;
/*Design an application in java that contains a class Student
 having properties name and percentage. Create a class Test that declares
 three instances of Student class. The values are passed through constructor at the time of its object creation.
The output should be the name and percentage of the topper.*/
public class Student2 {
    String name;
    int percent;

    public Student2(String name, int percent) {
        this.name = name;
        this.percent = percent;
    }
    public void display(){                                //display method
        System.out.println("Details of topper are");
        System.out.println(name +"  "+percent);
    }
}

class Test78{
    public static void main(String[] args) {
        Student2 s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        String name1,name2,name3;
        int p1,p2,p3;
        name1=sc.nextLine();
        p1=sc.nextInt();
        s1=new Student2(name1,p1);                    //taking input for 3 objects
        sc.nextLine();
        name2=sc.nextLine();
        p2=sc.nextInt();
        s2=new Student2(name2,p2);
        sc.nextLine();
        name3=sc.nextLine();
        p3=sc.nextInt();
        s3=new Student2(name3,p3);
        if(s1.percent>=s2.percent && s1.percent>=s3.percent)      //comparison for topper
            s1.display();
        else if(s2.percent>=s3.percent)
            s2.display();
        else
            s3.display();
    }
}
