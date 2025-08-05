import java.util.*;
class BankAccount{
    private double balance;
    BankAccount(double initialBalance){
       if(initialBalance >=0)balance = initialBalance;
       else balance =0;
    }
     public double getBalance(){
        return balance;
     }
     public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }

     }
     public void withdraw(double amount){
        if(amount <0){
            System.out.println("please give valid amount");
            return;
        }
        if(amount > balance){
            System.out.println("insufficient amount");

        }else {
            balance -=amount;
        }
     }
}

public class q19_Encapsulation {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deposit some money while opening account: ");

        BankAccount account = new BankAccount(sc.nextDouble());


        System.out.println("Account Balance is : "+ account.getBalance());
        account.deposit(3000.0);
        System.out.println("Account Balance after deposit is : "+ account.getBalance());
        account.withdraw(5000);
        System.out.println("Account Balance after withdraw is : "+ account.getBalance());


    }
}
