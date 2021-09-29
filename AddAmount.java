package Questions;
/* Suppose you have a Piggie Bank with an initial amount of 50 and you have to add some more amount to it. Create a class 'AddAmount' with a data member named 'amount' with an initial value of 50. Now make two constructors of this class as follows:
1 - without any parameter - no amount will be added to the Piggie Bank
2 - having a parameter which is the amount that will be added to Piggie Bank
Create object of the 'AddAmount' class and display the final amount in Piggie Bank.*/
public class AddAmount {
    int amount;

    public AddAmount(){                     //constructor overloading
        amount=50;
    }
    public AddAmount(int add){             //constructor overloading
        amount=50+add;
    }
    public void display(){
        System.out.println("Amount is "+amount);           //display for piggy bank
    }
}

class Test56{
    public static void main(String[] args) {
        AddAmount A=new AddAmount();
        AddAmount A2=new AddAmount(100);                //calling different constructors
        A.display();
        A2.display();

    }
}
