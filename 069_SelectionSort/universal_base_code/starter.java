import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*200);
		}
		System.out.print("The unsorted version of the array: ");
		printArray(arr);
		System.out.println("");
		System.out.print("The sorted version of the array: ");
		sortArray(arr);
		printArray(arr);
		
	}
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void sortArray(int[] arr) {
		int outer;
		int inner;
		int min_index;
		
		for(outer = 0; outer < arr.length; outer++) {
			min_index = outer;
			for(inner = outer + 1; inner < arr.length; inner++) {
				if(arr[inner] < arr[min_index]) {
					min_index = inner;
				}
			}
			int temp = arr[outer];
			arr[outer] = arr[min_index];
			arr[min_index] = temp;
		}
	}
	
}
