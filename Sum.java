package Questions;
/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers

Example1)
C:\>java filename 10 20
O/P Expected : The sum of 10 and 20 is 30*/
public class Sum {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);
        System.out.println(a+b);
    }
}
