import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++) {
			int r = (int)(Math.random()*100);
			arr[i] = r;
		}
		System.out.println("The unoganized version of the array is: ");
		for(int z = 0; z < arr.length; z++) {
			System.out.print(arr[z] + " ");
		}
		for(int i = 0; i < arr.length - 1; i++) {
			for(int r = 0; r < arr.length - i - 1; r++) {
				if(arr[r] > arr[r + 1]) {
					int temp = arr[r];
					arr[r] = arr[r + 1];
					arr[r + 1] = temp;
				}
			}
		}
		System.out.println("The organized version of the array is: ");
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
