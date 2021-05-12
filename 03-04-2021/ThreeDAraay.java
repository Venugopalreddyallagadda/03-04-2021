package com.ojas.mar04;

import java.util.Scanner;

public class ThreeDAraay {
	static void display(int college[][][]) {
		for (int i = 0; i<college.length; i++) {
			for(int j =0; j<college[i].length; j++) {
				for (int k = 0; k<college[i][j].length; k++)
				{
					System.out.println();
				}
				
			}
		}
		System.out.println("--------");
	}

	public static void main(String[] args) {
		int college[][][] = new int[2][2][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for (int i = 0; i<college.length; i++) {
			for(int j =0; j<college[i].length; j++) {
				for (int k = 0; k<college[i][j].length; k++) {
					college[i][j][k] = sc.nextInt();
					}
			}
		}
		
      display(college);
	}

}
