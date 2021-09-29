package Questions;

import java.math.BigInteger;
import java.util.Scanner;

/*Create class Number with only one private instance variable as a int primitive type. Initialize
it with parameterised constructor and include the following methods  isZero( ), isPositive(), isNegative( ),
isOdd( ), isEven( ), isPrime(), isAmstrong()
the above methods return boolean primitive type value.
getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return int primitive type value.
dispBinary(), dispOctal(), displayhexa() these method return string value */
public class Number {
    private int num;
    public Number(int num) {
        this.num = num;
    }           //parametarized constructor used
    public boolean isZero(){
        if(num==0)
            return true;
        else
            return false;
    }
    public boolean isPositive(){
        if(num>0)
            return true;
        else
            return false;
    }
    public boolean isNegative(){
        if(num<0)
            return true;
        else
            return false;
    }
    public boolean isOdd(){
        if(num%2!=0)
            return true;
        else
            return false;
    }
    public boolean isEven( ){
        if(num%2==0)
            return true;
        else
            return false;
    }
    public boolean isPrime(){
        int f=0;
        for(int i=2;i<num;i++)
            if(num%i==0){
                f=1;
                break;
            }
        if(f==0)
            return true;
        else
            return false;
    }
    public boolean isArmstrong(){
          int c=0,t;
          t=num;
          while(num!=0){
              c++;
              num/=10;
          }
          num=t;
          int s=0,l=0;
          while(t!=0){
              l=t%10;
              s+=Math.pow(l,c);
              t/=10;
          }
          if(num==s)
              return true;
          else
              return false;
    }
    public int getfactorial(){                    //all function definations
        int s=1;
        for(int i=1;i<=num;i++){
            s*=i;
        }
        return s;
    }
    public int getSqrt(){
        return (int)Math.sqrt(num);
    }
    public int getSqr(){
        return num*num;
    }
    public int sumDigits(){
        int s=0,t;
        t=num;
        while(num!=0){
            s+=(num%10);
            num/=10;
        }
        num=t;
        return s;
    }
    public String dispBinary(){
         return Integer.toBinaryString(num);
    }

    public String dispOctal(){
        return Integer.toOctalString(num);
    }
    public String  displayhexa(){
        return Integer.toHexString(num);
    }

}

class Test54{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Number n=new Number(sc.nextInt());
        System.out.println("is zero "+n.isZero());
        System.out.println("is positive "+n.isPositive());
        System.out.println("is negative "+n.isNegative()); //calling all function
        System.out.println("is even "+n.isEven());
        System.out.println("is odd "+n.isOdd());
        System.out.println("is Armstrong "+n.isArmstrong());
        System.out.println("is prime "+n.isPrime());
        System.out.println("factorial is"+n.getfactorial());
        System.out.println("Square is "+n.getSqr());
        System.out.println("Square root is "+n.getSqrt());
        System.out.println("Sum of digits "+n.sumDigits());
        System.out.println("in binary "+n.dispBinary());
        System.out.println("in octal "+n.dispOctal());
        System.out.println("in hexadecimal "+n.displayhexa());



    }
}
