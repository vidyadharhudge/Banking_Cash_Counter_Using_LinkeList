package com.Banking_Cash_Counter_Using_Linkedlist1;

import java.util.Scanner;

public class ProgramMain
{
    public static void main(String[] args)
    {
        //creating the object list
        Linkedlist list = new Linkedlist();
        int count = 0;
        //for user input
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no of peoples in queue ");
        int  PeopleInQue= sc.nextInt();
        //creating the bank object
        Banking bank = new Banking();
        do
        {
            int userMoney = 5000;
            int userbalance = userMoney;
            int totalBalanceOfUser = 0;
            //for user input cash
            System.out.println("enter cash :");
            int cash = sc.nextInt();
            //user input for withdrawl and cash
            System.out.println("please enter 1 for deposit 2 for withdraw");
            int userchoice=sc.nextInt();
            //switch statment for user choise
            switch (userchoice)
            {
                case 1:
                    totalBalanceOfUser = bank.depositCash(cash, userbalance);
                    //insert methode
                    list.insertAtLast(totalBalanceOfUser);
                    //display methode for total balance of user
                    System.out.println("balance is : " +totalBalanceOfUser);
                    //remove methode
                    list.removeAtFirst();
                    cash = 0;
                    break;

                case 2:
                    if (userbalance < cash)
                    {
                        System.out.println("not ifficient cash");
                    }
                    else
                    {

                        totalBalanceOfUser = bank.withdrawCash(cash, userbalance);
                        //insert methode
                        list.insertAtLast(totalBalanceOfUser);
                        //displaying total balance of user
                        System.out.println("total balance of user is : " +totalBalanceOfUser);
                        //remove methode
                        list.removeAtFirst();
                        cash = 0;
                    }
                    break;

            }
            count++;
        }
        while (count < PeopleInQue);


    }
}
