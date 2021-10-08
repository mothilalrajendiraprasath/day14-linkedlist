package com.company;

public class linkedList {
    node head;

    public void addNode(int data){
        node node = new node();
        node.data=data;
        node.next=null;
        if(head==null){
            head =node;
        }
        else{
            node temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public void display(){
        node node = head;
        while(node.next !=null){
            System.out.println("->"+node.data);
            node = node.next;
        }
            System.out.println("->"+node.data);
    }
}
