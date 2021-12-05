package Questions;

import java.util.InputMismatchException;

/*Write a class MathOperation which accepts 5 integers through command line.
Create an array using these parameters. Loop through the array and obtain the sum
and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException,
and so on should be handled.*/
public class Mathoperator {
    public static void main(String[] args) {
        int[] a=new int[5];
        int sum=0,n=0;
        try {
            for (int i = 0; i < a.length; i++) {
                a[i] = Integer.parseInt(args[i]);
            }


        for(int i=0;i<a.length;i++){
            sum+=a[i];
            //n++;
        }
        }catch(NumberFormatException ex){
            System.out.println("Please enter valid input");

        }catch(ArrayIndexOutOfBoundsException s){
            System.out.println("please enter something");
        }

        float avg=0;
        try{
            avg=sum/n;
        }catch(ArithmeticException ar){
            System.out.println("n is 0");
        }
        System.out.println("Average is "+avg);

    }
}
