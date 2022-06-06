import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;


class starter {
	
	public static void toStringArrayList(ArrayList <Integer> arr) {
		for(int x = 0; x < arr.size(); x++) {
			System.out.println(arr.get(x));
		}
	}
	public static int getArrayListAverage(ArrayList <Integer> arr) {
		int i = 0;
		for(int x = 0; x < arr.size(); x++) {
			int g = arr.get(x);
			i += g;
		}
		int a = i / arr.size();
		return a;
	}
	public static int getArrayListMax(ArrayList <Integer> arr) {
		int m = 0;
		for(int i = 0; i < arr.size(); i++) {
			int g = arr.get(i);
			if(g > m) {
				m = g;
			}
		}
		return m;
	}
	public static int getArrayListMix(ArrayList <Integer> arr) {
		int m = arr.get(0);
		for(int i = 0; i < arr.size(); i++) {
			int g = arr.get(i);
			if(g < m) {
				m = g;
			}
		}
		return m;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList <Integer> arr = new ArrayList <Integer>();
		Scanner input = new Scanner(System.in);
		System.out.println("How many values do you want");
		int x = input.nextInt();
		for(int i = 0; i < x; i++) {
			int y = (int)((Math.random())* 100 + 1);
			arr.add(y);
		}
		toStringArrayList(arr);
		System.out.println("The max value of this array is " + getArrayListMax(arr));
		System.out.println("The min value of this array is " + getArrayListMix(arr));
		System.out.println("The average of this array is " + getArrayListAverage(arr));
	}
}
