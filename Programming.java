package Questions;
/*Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then
the message "I love programming languages" should be printed. If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
For example, while creating object if we pass "Java", then "I love Java" should be printed.*/
public class Programming {
    String pro;

    public Programming() {                             //Constructor overloading
        pro = "I love programming languages";
    }
    public Programming(String add){                   //Constructor overloading
        pro="I love "+add;
    }
}

class Test8{
    public static void main(String[] args) {
        Programming p1=new Programming();
        Programming p2=new Programming("Java");       //calling constructors
        System.out.println(p1.pro);                        //displaying values
        System.out.println(p2.pro);                        //displaying values
    }
}
