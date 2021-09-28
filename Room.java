package Questions;

import java.util.Scanner;

/*Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores
 Boolean values to indicate whether the appliance is ON or OFF. Design a menu driven program in java that
 puts ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more
 than 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts,
 Fan consumes 400 watts and light consumes 100 watt.
 */
public class Room {
    Scanner sc=new Scanner(System.in);
    boolean AC_ON, HOME_THEATRE_ON, FAN_ON,LIGHT_ON;
    public void input_AC_ON(){               //taking inputs
        String Ac;
        System.out.println("AC is ON or OFF?");
        Ac=sc.nextLine();
        if(Ac.compareTo("ON")==0)
            AC_ON=true;
    }
    public void input_HOME_THEATRE_ON(){
        String Ac;
        System.out.println("HOME_THEATRE is ON or OFF?");
        Ac=sc.nextLine();
        if(Ac.compareTo("ON")==0)
            HOME_THEATRE_ON=true;
    }
    public void input_FAN_ON(){
        String Ac;
        System.out.println("FAN is ON or OFF?");
        Ac=sc.nextLine();
        if(Ac.compareTo("ON")==0)
            FAN_ON=true;
    }
    public void input_LIGHT_ON(){
        String Ac;
        System.out.println("LIGHT is ON or OFF?");
        Ac=sc.nextLine();
        if(Ac.compareTo("ON")==0)
            LIGHT_ON=true;
    }
    public int power(){                    //calculating total power
        int s=0;
        if(AC_ON)
            s+=1200;
        if(HOME_THEATRE_ON)
            s+=600;
        if(FAN_ON)
            s+=400;
        if(LIGHT_ON)
            s+=100;
        return s;

    }
}


class Test5{
    public static void main(String[] args) {
        Room r=new Room();
        r.input_AC_ON();
        r.input_HOME_THEATRE_ON();
        r.input_FAN_ON();
        r.input_LIGHT_ON();
        if(r.power()>=2000)                    //comparing powers
            System.out.println("Overloading");
        else
            System.out.println("power saving");
    }
}
