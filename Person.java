package Questions;
/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/
public class Person {
    String gender;
    int age;
    public void percentage(){
        if(gender.compareTo("Female")==0 && age>=1 && age<59)
            System.out.println("8.2%");
        else if(gender.compareTo("Female")==0 && age>=59 && age<=100)
            System.out.println("9.2%");
        else if(gender.compareTo("Male")==0 && age>=1 && age<59)
            System.out.println("8.4%");
        else if(gender.compareTo("Male")==0 && age>=59 && age<=100)
            System.out.println("10.5%");
    }
}
class Ty3{
    public static void main(String[] args) {
        Person p=new Person();
        p.age=Integer.parseInt(args[0]);
        p.gender=args[1];
        p.percentage();
    }
}
