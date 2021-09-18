package Questions;

import java.util.Scanner;

/*Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have just created), price (double), and qtyInStock (int)
[Assumption: Each book will be written by exactly one Author]
Parameterized Constructor: To initialize the variables
Getter methods  for all the member variables*/
class author{
   private String fname,mname,lname;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
public class Book {
    private String name;
    private author A;
    private double price;
    private int QIS;
    Book(String name,author A,double price,int QIS){
        this.name=name;
        this.A=A;
        this.price=price;
        this.QIS=QIS;
    }
    public void display(){
        System.out.println("Name of book "+name);
        System.out.println("Author "+A.getFname()+" "+A.getMname()+" "+A.getLname());
        System.out.println("Price "+price);
        System.out.println("Quantity in stock "+QIS);
    }

}
class Ty0{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        double price;
        int QIS;
        author a=new author();
        name=sc.next();
        a.setFname(sc.next());
        a.setMname(sc.next());
        a.setLname(sc.next());
        price=sc.nextDouble();
        QIS= sc.nextInt();
        Book b=new Book(name,a,price,QIS);
        b.display();
    }
}