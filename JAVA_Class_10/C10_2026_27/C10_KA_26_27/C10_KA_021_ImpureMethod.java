/** Demonstrating an example of impure method by creating a class named ImpureMethod */
/* ImpureMethod.java */
class ImpureMethod
{
    int accountNumber;
    double accountBalance;
    public double Deposit(double amount)
    {
        accountBalance = accountBalance + amount;
        return accountBalance;
    }
    public static void main(String args[])
    {
        double result;
        ImpureMethod myAccount = new ImpureMethod();
        System.out.println("Value of accountBalance before calling the Deposit() methods: " + myAccount.accountBalance);
        result = myAccount.Deposit(12000);
        System.out.println("Return value from the Deposit() method: " + result);
        System.out.println("Value of accountBalance after calling the Deposit() method first time: " + myAccount.accountBalance);
        result = myAccount.Deposit(12000);
        System.out.println("Return value from the Deposit() method: " + result);
        System.out.println("Value of accountBalance after calling the Deposit() method second time: " + myAccount.accountBalance);
    }
}