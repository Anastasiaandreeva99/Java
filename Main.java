package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount myaccount = new BankAccount("Anastasia","33");
        myaccount.showMenu();
    }
}
class BankAccount
        {
           int balance;//money you have
           int previousTransaction;
           String customerName;
           String customerId;
         BankAccount(String name,String id)
         {
             customerName=name;
             customerId = id;

         }
        void deposit(int money)
        {
            if(money!=0)
            {
                balance+=money;
                previousTransaction=money;
            }
            else System.out.println("The amount of money is 0!");
        }
        void withdraw(int money)
        {
                if(money!=0)
                {
                    balance-=money;
                    previousTransaction=-money;
                }
                else System.out.println("The amount of money is 0!");
        }
        void prinLastTransaction()
        {
            if(previousTransaction<0)System.out.println("Last transaction is withdrawn and the amount of money is : " + Math.abs(previousTransaction));
            else
            {
                if(previousTransaction>0)System.out.println("Last transaction is deposit and the amount of money is : " + Math.abs(previousTransaction));
                else System.out.println("No transactions");
            }
        }
        void showMenu()
        {
            Scanner scan = new Scanner(System.in);
            char option ='\0';
           System.out.println("Welcome " + customerName);
            System.out.println("YOur Id is: " + customerId);
            System.out.println("A.Check Balance");
            System.out.println("B.Deposit");
            System.out.println("C.WithDraw");
            System.out.println("D.Previous Transaction");
            System.out.println("E.Exit");
            do {
             System.out.println("-----------------------------------------------------");
             System.out.println("Select an option:");
             option=scan.next().charAt(0);
             switch (option)
             {
                 case 'A':
                     System.out.println("Balance = " + balance);
                     break;
                 case 'B':
                     System.out.println("Enter amount to deposit");
                     int deposit = scan.nextInt();
                     deposit(deposit);
                     break;
                 case 'C':
                     System.out.println("Enter amount to whitdraw");
                     int amount = scan.nextInt();
                     if(amount>balance)System.out.println("You don't have money!");
                     else withdraw(amount);
                     break;
                 case 'D':
                     System.out.println("Previous trnasaction:" +  previousTransaction);
                     break;
                 default:
                     System.out.println("-----");

             }
            }
            while(option!='E');

        }
        }
