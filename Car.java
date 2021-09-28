package Questions;

import java.util.Scanner;
/* Create a class Car having properties manufacturer and price. Create three instances of the class
and display the details of each car sorted with respect to the price.*/
public class Car {
  private String manufacturer;
  private float prices;

    public Car(String manufacturer, float prices) {
        this.manufacturer = manufacturer;
        this.prices = prices;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public float getPrices() {
        return prices;
    }
}

class test3{
    public static void main(String[] args) {  //main method
        int n=3;
        Scanner sc=new Scanner(System.in);
       Car[] c=new Car[n];                 //Cars array
       for(int i=0;i<c.length;i++){
           float f=sc.nextFloat();
           sc.nextLine();
           String man=sc.nextLine();
           c[i]=new Car(man,f);
       }
       Car temp;
       for(int i=0;i<n;i++){          //Bubble sort
           for(int j=0;j<n-i-1;j++){
               if(c[j].getPrices()>c[j+1].getPrices()){
                   temp=c[j];
                   c[j]=c[j+1];
                   c[j+1]=temp;
               }
           }
       }
       for(Car i:c){
           System.out.println(i.getManufacturer()+" "+i.getPrices());
       }
    }
}
