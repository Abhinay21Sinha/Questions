package Questions;

import java.util.Scanner;

class InvalidCountry extends RuntimeException{
    public InvalidCountry(String s){
        super(s);
    }
}
public class Registration {
   String name,country;

    public Registration(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Registration() {
        name="Unknown";
        country="Unknown";
    }
    public Registration(String name){
        this.name=name;
        country="Unknown";
    }
}

class test788{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Registration r=new Registration(sc.next(),sc.next());

            if(r.country.equals("India"))
                System.out.println("User registration done successfully");
            else
                throw new InvalidCountry("User is outside the India");

    }
}
