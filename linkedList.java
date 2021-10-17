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
        System.out.println("Added element is:"+node.data);
    }

    public void deleteAt(int index)
    {
        if(index==0) {
            head = head.next;
        }else{
            node temp = head;
            node temp2 = null;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp2=temp.next;
            temp.next=temp2.next;
            System.out.println("Deleted element is:"+temp2.data);
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
