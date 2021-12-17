package Questions;
import java.util.regex.*;
public class Pattern1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[Nn][a-zA-Z]+");
        String s="nhbhgvhgfgvygjvjhvgn vNtdtrtyfty";
        Matcher m= p.matcher(s);
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}
