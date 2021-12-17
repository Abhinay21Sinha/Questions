package Questions;

import java.util.regex.*;
public class Pattern4 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[^0][0-9]{9}");
        String s="0987865666 9878767543 98999999997654322222";
        Matcher m= p.matcher(s);
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}
