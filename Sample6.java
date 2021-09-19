package Questions;

import java.util.Scanner;

/*Write a program to print the sum of the elements of an array following the given below condition.

If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements - 10,3,6,1,2,7,9
O/P: 22
[i.e 10+3+9]

Eg2) Array Elements - 7 1 2 3 6
O/P:19

Eg3) Array Elements - 1,6,4,7,9
O/P:10*/
public class Sample6 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] a=new int[n];
        int p=0,q=0;
        for(int i=0;i<a.length;i++)
        { a[i] = sc.nextInt();}
        for(int i=0;i<a.length;i++){
            if(a[i]==6)
                p=i;
            else if(a[i]==7)
                q=i;
        }
        //System.out.println(p+" "+q);
        int s=0;
        for(int i=0;i<a.length;i++) {
            if (p>=q)
                s+=a[i];
            else if (i < p || i > q)
                s+=a[i];

        }
        System.out.println(s);


    }
}
