package Questions;

import java.util.Scanner;

/*Create a class 'Student' with three data members which are name,
age and address. The constructor of the class assigns default values name as "unknown",
age as '0' and address as "not available". It has two member methods with the same
name “setInfo”. First method has two parameters for name and age and assigns the
same whereas the second method takes three parameters which are assigned to name, age and address respectively.
Print the name, age and address of 10 students.*/
public class Student3 {
    String name;
    int age;
    String address;
    public Student3(){                     //non-parametarized constructor
        name="Unknown";
        age=0;
        address="not available";
    }
    public void setInfo(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address){     //function overloading name is setInfo
        this.name=name;
        this.age=age;
        this.address=address;
    }
}

class test4{
    public static void main(String[] args) {
        Student3[] s=new Student3[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<s.length;i++){
            String name,address;
            int age;
            if(i%2==0){
                System.out.println("give name and age");
                name=sc.nextLine();
                age=sc.nextInt();
                s[i]=new Student3();
                s[i].setInfo(name,age);
                sc.nextLine();
            }else{
                System.out.println("give name,age and address");
                name=sc.nextLine();
                age=sc.nextInt();
                sc.nextLine();
                address=sc.nextLine();
                s[i]=new Student3();
                s[i].setInfo(name,age,address);
            }
        }

        for(Student3 S:s){                                       //for each loop used only for display values
            System.out.println(S.name+"  "+S.age+"  "+S.address);
        }
    }
}
