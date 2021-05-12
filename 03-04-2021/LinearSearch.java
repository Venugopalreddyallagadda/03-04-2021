package com.ojas.mar04;

import java.util.Scanner;

public class LinearSearch {
	static String linearSearch(int searchElement, int numbers[]) {
		String res = "";
		int count = 0;
		for (int i = 0 ; i< numbers.length; i++) {
			if(searchElement ==numbers[i]) {
				count = i;
				break;
			}
		}
			if(count!=0) {
				res = "Element is found that index of "+(count);
			}
			else {
				res = "Not found";
			}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    int numbers[] = {1,5,6,7,8,9};
		System.out.println("Enter the element");
	    System.out.println(linearSearch(sc.nextInt(),numbers));	    	
	   
	}    		

}
