package Questions;

import java.util.Scanner;

/*Write a program by creating an 'Employee' class having the following methods and print the final salary.

1 - 'getInfo()' which takes the salary, number of hours of work per day of the employee as parameter
2 - 'AddSal()' which adds $10 to the salary of the employee if it is less than $500.
3 - 'AddWork()' which adds $5 to the salary of the employee if the number of hours of work per day is more than 6 hours.
*/
public class Employee2 {
    double salary;
    int WPD;
    public void getinfo(double salary,int WPD){
        this.salary=salary;
        this.WPD=WPD;
    }
    public void AddSal(){
        if(salary<=500)
            salary=salary+10;
    }
    public void AddWork(){
        if(WPD>6)
            salary=salary+5;
    }
    public void display(){
        System.out.println("Salary is "+salary);
    }
}
class Ty7{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee2 e=new Employee2();
        e.getinfo(s.nextDouble(),s.nextInt());
        e.AddSal();
        e.AddWork();
        e.display();
    }
}