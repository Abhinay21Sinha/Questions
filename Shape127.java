package Questions;
/* Write a program to create a class named shape. It should contain 2 methods,
draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively*/
public class Shape127 {
    public void draw(){
        System.out.println("Drawing shape");
    }
    public void erase(){
        System.out.println("erasing shape");
    }
}

class Ty{
    public static void main(String[] args) {
        Shape127 s=new Shape127();
        s.draw();
        s.erase();
    }
}
