package Questions;
/*Create a new class called Calculator with the following methods:
1. A static method called powerInt(int num1,int num2)
This method should return num1 to the power num2.
2. A static method called powerDouble(double num1,int num2).
This method should return num1 to the power num2.
3. Invoke both the methods and test the functionalities.
Hint: Use Math.pow(double,double) to calculate the power.*/
public class Calculator {
    public static void powerInt(int num1,int num2){
        System.out.println(Math.pow(num1,num2));
    }
    public static void powerDouble(double num1,int num2){
        System.out.println(Math.pow(num1,num2));
    }
}
class Ty8{
    public static void main(String[] args) {
        Calculator.powerInt(5,3);
        Calculator.powerDouble(2.4,3);
    }
}
