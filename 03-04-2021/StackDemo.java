package com.ojas.mar04;

import java.util.Scanner;

public class StackDemo {
	static int top = -1;
	static int size = 5;
	static int stack[] = new int [size];
	
	static void menu() {
		String m = "Menu Driven Application\n";
		m+= "1.push\n";
		m+= "2.pop\n";
		m+= "3.Display elements?\n";
		m+= "4.Exit\n";
		m+= "5.Select any option\n";
		System.out.println(m);
	}
	//isfull methods
    static boolean isFull() {
        boolean b = false;
        if(top ==size-1) {
            b = true;
        }
        return b;
        
    }//method close
    
    static boolean isEmpty() {
        boolean b = false;
        if(top == -1) {
            b = true;
        }
        return b;
        
    }//method close
    
    static void push(int element) {
        if(!isFull()) {
        stack[++top] = element;
        System.out.println("Add elements to stack");
        }//if close
        else {
            System.out.println("Stack is full");
        }
    }//method close
    
    static void pop() {
        if(!isEmpty()) {
        System.out.println("Deletes elements to stack"+ stack[top]);
        top --;
        }//if close
        else {
            System.out.println("Stack is empty");
        }
    }//method close
    
    static void display() {
        if(!isEmpty()) {
        System.out.println("Stack elements are as follows");
        for(int i =0;i<=top;i++) {
            System.out.println(stack[i]);
        }
        }//if close
        else {
            System.out.println("No elements is the stack");
        }
    }//method close
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
        menu();
        int choice = sc.nextInt();
        switch(choice) {
        case 1:
            System.out.println("Enter any values");
            push(sc.nextInt());
            break;
            
        case 2:
            pop();
            break;
            
        case 3:
            display();
            break;
            
        case 4:
            System.exit(0);
            break;
            
        default:
            System.out.println("invalid option");
        }//closing switch
     }
    }
}
