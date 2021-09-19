package Questions;

import java.util.Scanner;
/* Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true*/
public class sample7
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        boolean b=false;
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        int p=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=1 && a[i]!=4) {
                p=1;
                break;
            }
            }
        if(p==0)
            b=true;
        System.out.println(b);
        }
    }

