package Questions;
/*Write a program to check if the program has received command line arguments or not.

If the program has not received arguments then print "No Values", else print all the values in a single line separated by ,(comma)

Example1) java Example
O/P: No values

Example2) java Example Mumbai Bangalore
O/P: Mumbai,Bangalore
(Q7-27)*/
public class Sample9 {
    public static void main(String[] args) {
        if(args.length!=0){
            for(int i=0;i<args.length;i++)
            {System.out.print(args[i]);
                if(args.length-1==i)
                    continue;
                System.out.print(",");}

        }else
            System.out.println("No values");
    }
}
