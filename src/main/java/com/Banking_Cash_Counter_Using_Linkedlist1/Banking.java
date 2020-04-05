package com.Banking_Cash_Counter_Using_Linkedlist1;

public class Banking implements bank
{
    //user deposit cash
    public int depositCash(int cash, int ubalance)
    {

        ubalance += cash;
        return ubalance;
    }

    // user withdraw cash
    public int withdrawCash(int cash, int ubalance)
    {
        if (ubalance <= 0)
        {
            System.out.println("cash is not available");
            return 0;
        }
        else
        {
            ubalance -= cash;
            return ubalance;
        }
    }

}
