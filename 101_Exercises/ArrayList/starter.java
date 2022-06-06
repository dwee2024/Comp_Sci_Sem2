import java.util.ArrayList;
import java.util.Scanner;

class starter {
	//Methods go here

	public static void main(String args[]) {
		// Your code goes below here
		Scanner b = new Scanner(System.in);
		ArrayList<Integer> input = new ArrayList<Integer>();
		System.out.println("How many values do you want to add to the ArrayList");
		int y = b.nextInt();
		addValuesArrayList(y,input);
		printArrayList(input);
		removeDuplicates(input);
	}
	public static void printArrayList(ArrayList <Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	public static void addValuesArrayList(int n, ArrayList<Integer> arr) {
		for(int x = 0; x < n; x++) {
			int i = (int)((Math.random()) * 100 + 1);
			arr.add(i);
		}
		
	}
}
