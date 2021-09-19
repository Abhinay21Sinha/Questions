package Questions;
/*Initialize an integer array with ascii values and print the corresponding character values in a single row.*/
import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("no.of elements");
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<a.length;i++)
            System.out.print((char)a[i]+" ");
    }
}
