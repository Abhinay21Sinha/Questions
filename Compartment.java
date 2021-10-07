package Questions;

abstract public class Compartment {
    abstract public String notice();
}

class FirstClass extends Compartment{             //inheritance of abstract method
    public String notice(){
        return "Firstclass\n";
    }
}

class Ladies extends Compartment{
    public String notice(){
        return "Ladies\n";
    }
}

class General extends Compartment{
    public String notice(){
        return "General\n";
    }
}

class luggage extends Compartment{
    public String notice(){
        return "luggage\n";
    }
}

class Testcompartment{
    public static void main(String[] args) {
        Compartment[] c=new Compartment[10];
        for(int i=0;i<c.length;i++){
            if(i==0)
                c[i]=new FirstClass();
            else if (i==1)
                c[i]=new Ladies();
            else if(i==2)
                c[i]=new General();                //taking different objects
            else if(i==3)
                c[i]=new luggage();
            else
                c[i]=new Compartment() {
                    @Override
                    public String notice() {     //Anonymous class
                        return "Anonymous\n";
                    }
                };
        }
        for(var i:c){
            System.out.print(i.notice());
        }
    }
}