import java.util.*;
import java.time.*;
class InsufficientBalanceException extends Exception{}
class Account
     {
              int accountNumber=1000000001;
              String accountHolderName;
              LocalDate openedDate;
              double balance;
              Account(String name,double bal) throws InsufficientBalanceException{
                  this.accountNumber+=1;
                  this.accountHolderName=name;
                  this.openedDate=LocalDate.now();
                  if(bal>=5000){
                    this.balance=bal;
                  }
                  else{
                      throw new InsufficientBalanceException();
                  }
              }
              void setBalance(double b){
                  this.balance=b;
              }
              double getBalance(){
                  return this.balance;
              }
              LocalDate getOpenedDate(){
                  return this.openedDate;
              }
              int getAccountNumber(){
                  return this.accountNumber;
              }
              String getAccountHolderName(){
                  return this.accountHolderName;
              }
              // provide all constructors , setters , getters and validation methods
             // always balance must not be less than 5000 Rs.
   }



class Transaction
{
        public static double deposit(Account account , double amount)
        {
                 account.setBalance(account.getBalance()+amount);
                 return account.getBalance();
        }
        public   static double withdraw(Account account ,  double amount) throws InsufficientBalanceException
       {
          if(account.getBalance()-amount<5000){
              throw new InsufficientBalanceException();
          }
          else{
              account.setBalance(account.getBalance()-amount);
              return account.getBalance();
          }
       }
}
public class Main{
    
    public static void main(String args[]){
       try{
            Account a1=new Account("mahe",10000);
            Transaction t1=new Transaction();
            System.out.println(a1.getBalance());
            System.out.println(t1.deposit(a1,500));
            System.out.println(t1.withdraw(a1,1500));
            System.out.println(t1.withdraw(a1,20000));
       }
       catch(InsufficientBalanceException i){
           System.out.println("Insufficient Balance");
       }
        
    }
}
