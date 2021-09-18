package Questions;
/* Write a Program that accepts two Strings as command line arguments and generate the output in the required format.

Example1)
If the two command line arguments are GLA and Mathura then the output generated should be GLA University Mathura.

Example2)
If the command line arguments are AAA and Delhi then the output generated should be AAA Technologies Delhi
*/
public class bju {
    public static void main(String[] args) {
        String a,b;
        a=args[0];
        b=args[1];
        if(a.compareTo("GLA")==0 && b.compareTo("Mathura")==0)
            System.out.println(a+" University "+b);
        else if(a.compareTo("AAA")==0 && b.compareTo("Delhi")==0)
            System.out.println(a+" Technologies "+b);
    }
}
