package Questions;

import java.util.Scanner;

/*Create a class named 'Member' having the following members:

Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
 'Manager' classes have data members 'specialization' and 'department' respectively. Now,
 assign name, age, phone number, address and salary to an employee and a manager by making
 an object of both of these classes and print the same.*/
public class Member {
    String name;
    int Age;
    String phone_no;
    String Address;
    float salary;

    public Member() {
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        Age=sc.nextInt();
        phone_no= sc.next();
        sc.nextLine();
        Address= sc.nextLine();
        salary= sc.nextFloat();
        sc.nextLine();
    }

    public void printsalary(){
        System.out.println("Salary is "+salary);
    }
}
class Employee5 extends Member{
    String Specialization;

    public Employee5(String specialization) {
        super();
        Specialization = specialization;
    }
    public void display(){
        System.out.println(name+" "+Age+" "+phone_no+" "+Address+" "+Specialization);
        printsalary();
    }
}

class Manager extends Member{
    String Department;

    public Manager(String department) {
        super();
        Department = department;
    }
    public void display(){
        System.out.println(name+" "+Age+" "+phone_no+" "+Address+" "+Department);
        printsalary();
    }
}

class Test569{
    public static void main(String[] args) {
        Employee5 e=new Employee5("CS(AIML)");
        Manager m=new Manager("Electrical");
        e.display();
        m.display();

    }
}
