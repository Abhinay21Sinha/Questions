package Questions;

import java.util.Scanner;
/*Q2. At GLA College of  Programming, the final school fees to be paid is calculated as follows.
•	Original Fees should be greater than or equal to R50 000
•	Minimum fixed deposit of R10 000
•	If a deposit is greater than pr equal to half the original fees, you get a 5% discount from the original fees
•	Final total fees will also include the following
1.	School Levy is 10% of original fees
2.	Sports fee is 5% of the original fees.
Write a program the calculates the final total fees to be paid.

Program must request user to enter original fees value greater then R50 000.
Program should also request user to enter amount to deposit before calculating final total fees.*/
public class Deposit {

    float deposit;
    float original;
}
class Test64{
    public static void main(String[] args) {
        Deposit d=new Deposit();
        System.out.println("original amount should be greater then o equal to 50000");
        Scanner sc=new Scanner(System.in);
        d.original=sc.nextFloat();
        System.out.println("minimum fixed deposit should be 10000");
        d.deposit=sc.nextFloat();
        if(d.deposit>=(d.original/2)){
            d.original=d.original-(((float)5/100)*d.original);
        }

        float final_fee=d.original+d.deposit+((float)5/100)*d.original+((float)10/100)*d.original;
        System.out.println("orginal fees "+final_fee);

    }
}