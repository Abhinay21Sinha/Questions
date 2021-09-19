package Questions;

import java.util.Scanner;
/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.

Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers

Example2)
C:\>java Sample 1 2 3 4
O/P:
 The given array is :
  1 2
  3 4
 The reverse of the array is :
  4 3
  2 1*/
public class Sample8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]  []a=new int[2][2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++)
                a[i][j]=sc.nextInt();
        }
        for(int i=a.length-1;i>=0;i--){
            for(int j=a[i].length-1;j>=0;j--)
                System.out.print(a[i][j]+" ");
            System.out.print("\n");
        }
    }
}
