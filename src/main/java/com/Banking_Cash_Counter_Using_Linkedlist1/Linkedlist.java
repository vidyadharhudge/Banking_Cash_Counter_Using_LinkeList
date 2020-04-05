package com.Banking_Cash_Counter_Using_Linkedlist1;

public class Linkedlist
{
    node head;
    //node class create
    class node
    {
        //data
        int data;
        //address of next node
        node next;
        //constructor for initialization
        public node(int value)
        {
            data = value;
            next = null;
        }
    }
    //insert people in queue
    void insertAtLast(int value)
    {
        //creating the new node and passing the value
        node newNode = new node(value);
        //creating the new node and passing the null
        newNode.next = null;
        if (head == null)
        {

            head = newNode;
        }
        else
        {
            //creating temp node and passing it head
            node temp = head;
            while (temp.next != null)
            {
                temp = temp.next;
            }
            //passing refrence to the next node
            temp.next = newNode;
        }
    }

    // remove people first and shows remaining mony
    void removeAtFirst()
    {
        node temp = head.next;
        int avalibaleCash = head.data;
        System.out.println("total cash .. " + avalibaleCash);
        head = temp;
    }

    //print the data
    void printList()
    {
        node currentNode = head;
        //for traversing the node
        while (currentNode.next != null)
        {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }

}
