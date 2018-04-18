package com.java.practice;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.Arrays;

public class Sort {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length of array: ");
		int arrLength = input.nextInt();
		
		int array[] = new int[arrLength];
		
		for(int i=0; i<arrLength; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		System.out.println("The sorted array is: " +Arrays.toString(sortArray(array)));
	}
	
	
	public static int[] sortArray(int[] nonSortedArray) {
		int[] sortedArray = new int[nonSortedArray.length];
		int tmp;
		
		for(int j=0; j<nonSortedArray.length-1; j++) {
			
			for(int i=0; i<nonSortedArray.length-1; i++) {
				if(nonSortedArray[i]>nonSortedArray[i+1]) {
					tmp = nonSortedArray[i];
					nonSortedArray[i] = nonSortedArray[i+1];
					nonSortedArray[i+1] = tmp;
					
					sortedArray = nonSortedArray;
				}
			}
		}
		
		return sortedArray;
		
	}
}   
      

