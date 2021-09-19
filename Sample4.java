package Questions;

import java.util.Scanner;
/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given  number in the array.

Example 1) If the Array elements are  {1,4,34,56,7} and the search element is 90, then the output expected is -1.

Example 2)If the Array elements are  {1,4,34,56,7} and the search element is 56, then the output expected is 3.
*/
public class Sample4
{
    public static void main(String[] args) {
        int a[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("no.of elements ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The number for searching ");
        int m=sc.nextInt();
        int p=0;
        for(int i=0;i<n;i++){
            if(a[i]==m){
                p=1;
                System.out.println("The number is at "+(i+1));
                break;
            }

        }
        if(p==0)
            System.out.println("-1");

    }
}
