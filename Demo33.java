package Questions;

import java.util.Scanner;

/*Create an int array of size 5, initialize it with values(10,20,30,40,50). Create
a public boolean search(int arr[], int search_element) this method will return true if the search element
is present in the array else it will  print a message "element not found"*/
class sea{
    public static boolean search(int ar[],int search_element){  //static search method
        for(int i=0;i<ar.length;i++)
            if(ar[i]==search_element)
                return true;
        return false;
    }
}
public class Demo33 {
    public static void main(String[] args) {
        int[] ar=new int[5];              //taking array of 5
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            ar[i]=sc.nextInt();
        }
        System.out.println("value for searching ");
        int v=sc.nextInt();
        if(sea.search(ar,v)==false)                 //calling for search and providing rest of logic
            System.out.println("element not found");
        else
            System.out.println(sea.search(ar,v));
    }


}
