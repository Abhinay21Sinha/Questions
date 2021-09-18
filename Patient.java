package Questions;

import java.util.Scanner;

/* Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
Name of the class - Patient
Member Variables - patientName(String),height(double),weight(double)
Member Function - double computeBMI()
The above method should compute the BMI and return the result. The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
Create an object of the Patient class and check the results.
*/
public class Patient {
    String name;
    double height;
    double weight;
    double computeBMI(){
        return weight/(height*height);
    }
}
class Ty1{
    public static void main(String[] args) {
        Patient p=new Patient();
        Scanner sc=new Scanner(System.in);
        p.name=sc.nextLine();
        p.height=sc.nextDouble();
        p.weight=sc.nextDouble();
        System.out.println("BMI is "+p.computeBMI());
    }
}