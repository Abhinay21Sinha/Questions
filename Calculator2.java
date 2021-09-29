package Questions;

import java.util.Scanner;

/*Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.*/
public class Calculator2 {
    public static double PowerInt(int num1,int num2){             //Static methods
        return Math.pow(num1,num2);
    }

    public static double PowerDouble(double num1,int num2){        //Static methods
        return Math.pow(num1,num2);
    }
}

class Test90{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Calculator2.PowerInt(sc.nextInt(),sc.nextInt()));        //calling static methods
        System.out.println(Calculator2.PowerDouble(sc.nextDouble(),sc.nextInt())); //calling static methods
        //displaying and taking input sametime
    }
}