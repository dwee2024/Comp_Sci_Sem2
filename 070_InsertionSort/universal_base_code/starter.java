import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int[2000000];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*200);
		}
		System.out.println("The unsorted version of the array is: ");
		print(arr);
		System.out.println(" ");
		System.out.println("The sorted version of the array is: ");
		insort(arr);
		print(arr);
	}
	public static void print(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void insort(int[] arr) {
		int outer, inner, key;
		for(outer = 1; outer < arr.length; outer++) {
			key = arr[outer];
			inner = outer - 1;
			
			while(inner >= 0 && arr[inner] > key) {
				arr[inner + 1] = arr[inner];
				inner = inner - 1;
			}
			arr[inner + 1] = key;
		}
	}
}
