package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	linkedList list = new linkedList();
        list.addNode(56);
        list.addNode(30);
        list.addNode(76);
        list.display();
        list.addAt(2,33);
      list.display();

     list.deleteAt(3);
     list.display();

    }
}
