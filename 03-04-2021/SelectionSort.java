package com.ojas.mar04;

import java.util.Scanner;

public class SelectionSort {
	static void selectionSort(int num[]) {
		int temp = 0; 
		for ( int i = 0; i< num.length; i++) {
			for ( int j = i+1; j< num.length; j++ ) {
				if (num[i] > num[j]) {
					temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
			System.out.println(num[i]);
		}	
	}
		
	public static void main(String[] args) {
		int num[] = new int[5];
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i = 0; i < num.length;i ++) {
			num[i] = sc.nextInt();
			
		}
	     selectionSort(num);
	}  
}
