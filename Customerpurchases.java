package Questions;

import java.util.Scanner;

/*Santa  runs a local musical equipment store in your neighbourhood. He has contracted
you to create an interactive application that will assist him with customer purchases.
Create a class named
Customer Purchases that will contain get and set methods
 for a customer number, first name, surname, product, price and quantity.
 Create a separate class called Printing that will include a method
  called Print Details, that will print the Customer Invoice. In the Printing
  class include another method called Customer Purchase Report which will display
  the following information:
REPORT OPTION PERCENTAGE
TAX 15%
COMMISSION 8.5%
DISCOUNT 10%
TOTAL (Price + Tax) – (Discount + Commission)

In your main class, capture all the customer purchase details required to produce the reports.*/
public class Customerpurchases {
    private String first_name;
    private String sur_name;
    private String prod;
    private float price;
    private int quan;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSur_name() {
        return sur_name;
    }

    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public String getProd() {
        return prod;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }
}

class Printing{
    Customerpurchases c;
    public Printing(Customerpurchases c) {
        this.c=c;
    }

    public void Printdetails(){
        System.out.println(c.getFirst_name()+" "+c.getSur_name()+" product name "+c.getProd()+" and Quantity "+c.getQuan());
    }

    public void Customer_purchase_report(){
        float T=((float)15/100)*c.getPrice();
        float C=((float)8.5/100)*c.getPrice();
        float D=((float)10/100)*c.getPrice();
        System.out.println("TAX "+T);
        System.out.println("Comassion "+C);
        System.out.println("Discount "+D);
        System.out.println("Total "+((c.getPrice()+T)-(D+C)));
    }
}

class Pro{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Customerpurchases c=new Customerpurchases();
        c.setFirst_name(sc.next());
        c.setSur_name(sc.next());
        c.setProd(sc.next());
        c.setPrice(sc.nextFloat());
        c.setQuan(sc.nextInt());
        Printing p=new Printing(c);
        p.Printdetails();
        p.Customer_purchase_report();
    }
}
