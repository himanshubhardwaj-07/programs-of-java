// Create a base class BankAccount with:
// String accountHolder and double balance
// Constructor that accepts account holder name and balance
// Method displayBalance() to show the balance
// Create a derived class SavingsAccount that:
// Has double interestRate
// Constructor accepts name, balance, and interest rate, calls parent constructor
// Method calculateInterest() to calculate and print interest as:
class BankAccount {
    String accountholder;
     double balance;
BankAccount(String accountholder  ,double balance){
    this.accountholder=accountholder;
    this.balance=balance;
    System.err.println("These are the details of getting the bank account holder name and the balance:"+accountholder+" "+balance);
    }
    
}
class calculateInterest extends BankAccount {
    int interestRate;
    calculateInterest(String accountholder, double balance,int interestRate) {
        super(accountholder,balance);
        
       System.err.println("the data");
       double interest = balance * interestRate / 100;
       System.err.println("This is the inter rate of the followed:"+interest);

    }
    
}
public class forq{
    public static void main(String[] args) {
        calculateInterest obj = new calculateInterest("Himanshu", 3121, 8);
    }
}