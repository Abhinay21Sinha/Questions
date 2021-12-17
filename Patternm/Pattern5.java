package Questions;

import java.util.regex.*;
public class Pattern5 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z_][a-zA-Z0-9_.]+[@](gmail.com|yahoo.com|)");
        String s="abc@gmail.com _ab@yahoo.com a.b_@gmail.com an@gmail.com";
        Matcher m= p.matcher(s);
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}

