package Questions;
/*Write a Program to take care of Number Format Exception if the user enters values other than integer for c
alculating the average marks of 2 students. The name of the stu
dents and marks in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take c
are of Negative values and values out of range (i.e. other than in the range of 0-100). */
public class NegativerangeException extends Exception{
    public NegativerangeException(String s){
        super(s);
    }
}

class Test786{
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        int t=0;
        try{
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a[i].length;j++){
                    a[i][j]=Integer.parseInt(args[t]);
                    t++;
                    if(a[i][j]>100 || a[i][j]<0)
                        throw new NegativerangeException("your marks are not in range (0-100");
                }
            }
       }catch(NumberFormatException r){
            System.out.println("please don't enter string "+r.getStackTrace());
        }catch(NegativerangeException u){
           System.out.println("please enter number between 0 to 100"+u.getStackTrace());
        }
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum+=a[i][j];
            }
            System.out.println("Average of student "+(i+1)+" is "+((float)sum)/3);
        }


    }
}
