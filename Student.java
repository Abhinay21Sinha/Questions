package Questions;

import java.util.Scanner;

/*Write a program to print the names of students by creating a Student class. If no
name is passed while creating an object of Student class, then the name should be "Unknown",
otherwise the name should be equal to the String value passed while creating object of Student class.
 */
public class Student {
    String name;
    Student(){
        name="Unknown";
    }
    public void display(){
        System.out.println("name is "+name);
    }
}
class Ty9{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student s1=new Student();
        Student s2=new Student();
        s2.name=s.nextLine();
        s1.display();
        s2.display();

    }
}
