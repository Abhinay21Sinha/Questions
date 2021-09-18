package Questions;
/* write a Java program to find if the given number is palindrome or not

Example1)
C:\>java Sample 110011
O/P: 110011 is a palindrome

Example2)
C:\>java Sample 1234
O/P: 1234 is not a palindrome*/
import java.util.Scanner;

public class palli {
    public static void main(String[] args) {
        int n,t,l=0,s=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        t=n;
        for(;n!=0;n=n/10){
            l=n%10;
            s=10*s+l;
        }
        if(s==t)
            System.out.println("palindrome");
        else
            System.out.println("Not palindrome");
    }
}
