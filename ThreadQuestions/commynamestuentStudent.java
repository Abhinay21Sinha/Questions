package Questions.ThreadQuestions;

import java.util.Scanner;

/*A program to demonstrate custom exceptions. Create a
com.myname.stuent.Student class with three private fields name, rollNo, &
CPI. Create Getter and Setter for all the fields, override the public String toString()
method of Object class, to represent Student objects as String. Create a com.myname.main.
StudentMain class which is the implementation class contains main method and a search()
method. main method will create a list of students i.e array and initialize each objects
by taking input from user using java.util.Scanner class. This method will also call search
method and print the result. search() method will accept two arguments first is Student[]
list and int rollNo. This method will return Student object if rollNo matches with any of
the Student object or else it will throw an user defined exception InvalidStudentException.
com.myname.exception.InvalidStudentException is a class which extends
java.lang.Exception class and have one parameterized
constructor which accept an argument String message.*/
class InvalidStudentException extends Exception{
    public InvalidStudentException(String s){
        super(s);
    }
}
public class commynamestuentStudent {
    private String name;
    private int rollno;
    private float CPI;
    public String toString(){
        return "Student";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public float getCPI() {
        return CPI;
    }

    public void setCPI(float CPI) {
        this.CPI = CPI;
    }


}
class commynamemainStudentMain{
    public static void main(String[] args) throws InvalidStudentException {
        Scanner sc=new Scanner(System.in);
        commynamestuentStudent[] Stu=new commynamestuentStudent[3];
        for(int i=0;i<Stu.length;i++){
            Stu[i]=new commynamestuentStudent();
            Stu[i].setName(sc.next());
            Stu[i].setRollno(sc.nextInt());
            Stu[i].setCPI(sc.nextFloat());
        }
        System.out.println("Enter the roll");
        int r1=sc.nextInt();
        search(Stu,r1);
    }
    public static void search(commynamestuentStudent S[], int r) {
        int t=0;
        for(int i=0;i<S.length;i++){
            if(S[i].getRollno()==r){
                System.out.println("name is "+S[i].getName()+" and CPI is " +S[i].getCPI());
            }else
                t++;
        }try {
            if (t == S.length) {
                throw new InvalidStudentException("not on roll list");
            }
        }catch(InvalidStudentException u){
            System.out.println("invalid roll");
        }

    }
}