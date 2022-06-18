/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atm.functions;
import java.util.*;
/**
 *
 * @author LENOVO
 */
public class atm {
    public static void main(String[] args) {
        int total=20000;
        int deposit=0;
        int withdrawMoney=0;
        int sendAmount=0;
        String name="Jatin";
        String sender="Jatin";
        String reciever="Kunal";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter account Holder Name:");
        name=sc.nextLine();
        System.out.print("Enter acoount number:");
        int ac=sc.nextInt();
        if(ac==123&&name.equals("Jatin"))
        {
            System.out.println("\t\tWelcome to Oasis ATM");
        
        System.out.println("\t\tWe provide best ATM Services in World");
        do
        {      
        System.out.println("\nSelect the option :");
        System.out.println("1.Transactions History\n");
        System.out.println("2.Withdraw\n");
        System.out.println("3.Deposit\n");
        System.out.println("4.Transfer\n");
        System.out.println("5.Quit");
        System.out.print("\nEnter your choice:");
        int ch=sc.nextInt();
        if(ch==5)
        {
            System.out.println("Thank you for using Oasis ATM");
            break;
        }
        
       switch(ch)
       {
           case 1:
           {
               System.out.print("Account Holder name:"+name);
               System.out.println("\tAccount Balance:"+total);
               System.out.print("\n\t\tTransactions are:\n");
               System.out.print("Sender Name: "+sender);
               System.out.print("\tReciever Name: "+reciever);
               System.out.print("\tAmount send: "+sendAmount);
               System.out.print("\n\t\t Money Deposits ");
               System.out.print("\nAccount Holder Name: "+name+" Deposited Money: "+deposit);
                 System.out.print("\n\t\t Money Withdarws ");
               System.out.print("\n Account Holder Name: "+name+" Withdraw Money: "+withdrawMoney);
               
               
               break;
           }
           case 2:
           {
               System.out.print("Enter name:");
               sc.nextLine();
               name=sc.nextLine();
               System.out.print("Enter account Number:");
                ac=sc.nextInt();
               System.out.print("Enter amount to withdraw:");
                withdrawMoney=sc.nextInt();
               total=total-withdrawMoney;
               System.out.print("Balance after withdraw money:");
               System.out.println(total);
               
               break;
           }
           case 3:
           {
                System.out.print("Enter name:");
                sc.nextLine();
                 name=sc.nextLine();;
               System.out.print("Enter account Number:");
                ac=sc.nextInt();
               System.out.print("Enter amount to deposit:");
               deposit=sc.nextInt();
               total=total+deposit;
               System.out.println("Balance after deposit:"+total);
               
               break;
           }
           case 4:
           {
               
               System.out.print("Enter sender name:");
               sc.nextLine();
               System.out.println("Enter acount number:");
               ac=sc.nextInt();
               sender=sc.nextLine();
               System.out.print("Enter reciever name:");
                reciever=sc.nextLine();
               System.out.print("Enter amount to send:");
               sendAmount=sc.nextInt();
               total=total-sendAmount;
               System.out.println("After sending bank balance is:"+total);
               break;
           }
       }
        
        }while(true);
    }
        else
        {
            System.out.println("You provide wrong details Please try again");
        }
    }
}
