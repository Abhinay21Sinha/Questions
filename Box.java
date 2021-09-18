package Questions;

import java.util.Scanner;

/*Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can
return the volume of the box. Create an object of the Box class and test the functionalities.
 */
public class Box {
    int length;
    int breadth;
    int width;
    Box(int length,int breadth,int width){
        this.length=length;
        this.breadth=breadth;
        this.width=width;
    }
    public int volume(){
        return length*breadth*width;
    }
}
class ty11{
    public static void main(String[] args) {
        int length,breadth,width;
        Scanner sc=new Scanner(System.in);
        length=sc.nextInt();
        breadth=sc.nextInt();
        width= sc.nextInt();
        Box b=new Box(length,breadth,width);
        System.out.println(b.volume());
    }
}