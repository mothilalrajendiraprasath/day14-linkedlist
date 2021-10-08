package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	linkedList list = new linkedList();

    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the first element:");
    int a = scanner.nextInt();
    list.addNode(a);
    System.out.println("Enter the second element:");
    int b = scanner.nextInt();
    list.addNode(b);
    System.out.println("Enter the third element:");
    int c = scanner.nextInt();
    list.addNode(c);

    list.display();
    }
}
