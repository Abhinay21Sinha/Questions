package Questions;

import java.util.Scanner;

/*Write a program that would print the information (name, year of joining, address) of three employees by creating a class named 'Employee'. The output should be as follows:


Name Year of joining Address
Aman    2021   Chandigarh
Sunil 2000    Mathura
Rohan 2010       Agra*/
public class Employee
{
    String name;
    int YOJ;
    String Add;
    Employee(String name,String Add,int YOJ){
        this.name=name;
        this.YOJ=YOJ;
        this.Add=Add;
    }
    public void display(){
        System.out.println(name+"     "+YOJ+"    "+Add);
    }
}
class Ty4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee e1,e2,e3;
        e1=new Employee(s.nextLine(),s.nextLine(),s.nextInt());
        s.nextLine();
        e2=new Employee(s.nextLine(),s.nextLine(),s.nextInt());
        s.nextLine();
        e3=new Employee(s.nextLine(),s.nextLine(),s.nextInt());
        System.out.println("Name     "+"Year of joining     "+"Address");
        e1.display();
        e2.display();
        e3.display();

    }
}