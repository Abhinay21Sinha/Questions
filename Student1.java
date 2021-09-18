package Questions;

import java.util.Scanner;

/*Design an application in java that contains a class Student
having properties name and percentage. Create a class Test that declares three
 instances of Student class. The values are passed through constructor at the time of its object creation.
The output should be the name and percentage of the topper.*/
public class Student1 {
    private String name;
    private double percent;
    Student1(String name,double percent){
        this.name=name;
        this.percent=percent;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
class Test{
    public static void main(String[] args) {
        String name1,name2,name3;
        double p1,p2,p3;
        Scanner sc=new Scanner(System.in);
        name1= sc.nextLine();
        p1=sc.nextDouble();
        sc.nextLine();
        name2= sc.nextLine();
        p2=sc.nextDouble();
        sc.nextLine();
        name3= sc.nextLine();
        p3=sc.nextDouble();
        Student1 s1,s2,s3;
        s1=new Student1(name1,p1);
        s2=new Student1(name2,p2);
        s3=new Student1(name3,p3);
        if(s1.getPercent()>=s2.getPercent() && s1.getPercent()>= s3.getPercent())
            System.out.println("Topper is "+s1.getName());
        else if(s2.getPercent()>=s3.getPercent())
            System.out.println("Topper is "+s2.getName());
        else
            System.out.println("Topper is "+s3.getName());
    }
}
