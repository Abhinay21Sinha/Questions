package Questions;

import java.util.regex.*;
public class Pattern6 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[^a-zA-Z0-9]");
        String s="hbkjbhjk hfthxdrd ggyjv@fgdh uhu ";
        Matcher m= p.matcher(s);
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}
