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

    public void addAt(int index , int data){
        node node = new node();
        node.data=data;
        node.next=null;

        node temp = head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
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
