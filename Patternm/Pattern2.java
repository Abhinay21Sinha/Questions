package Questions;

import java.util.regex.*;
public class Pattern2 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("[a-zA-Z]+(j|J)");
        String s="mnhj vNtdtjrtyytfrdtctrdftjy";
        Matcher m= p.matcher(s);
        while(m.find()){
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
    }
}
