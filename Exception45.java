package Questions;
/*Write a program to accept name and age of a person from the command
prompt(passed as arguments when you execute the class) and ensure that the
age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case
the arguments passed are not proper.*/
class Invalidage extends RuntimeException{
    public Invalidage(String s){
        super(s);
    }
}

public class Exception45 {
    public static void main(String[] args) {
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        try {
            if (age > 60 || age < 18)
                throw new Invalidage("Age should be in between 18 to 60");
            System.out.println("name is " + name + " and age is " + age);
        }catch(Invalidage f){
            System.out.println("Exception at "+f.getStackTrace()+" "+f.getMessage());
        }
    }

}
