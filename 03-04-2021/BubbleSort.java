package com.ojas.mar04;

import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int num[]) {
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j <num.length-i; j++) {
				if(num[j-1] > num[j]) {
					temp = num[j-1];
					num[j-1] = num[j];
					num[j] = temp;
				}
			}

		}
		
	}
	public static void main(String[] args) {
		int num[] = new int[5];
  		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i = 0; i <= num.length-1;i ++) {
			num[i] = sc.nextInt();

	}
		System.out.println("result");
	  bubbleSort(num);
	  for(int i = 0; i <= num.length-1;i ++) {
			System.out.println(num[i]);

	}
	}
}
