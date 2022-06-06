import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> bArray = new ArrayList<Integer>(100);
		ArrayList<Integer> sArray = new ArrayList<Integer>(100);
		ArrayList<Integer> iArray = new ArrayList<Integer>(100);
		System.out.println("The unsorted arrayList for bubble sort is: ");
		randomArr(bArray, 100);
		printArr(bArray);
		System.out.println("");
		System.out.println("The sorted arrayList for bubble sort is: ");
		sortB(bArray);
		printArr(bArray);
		System.out.println("The median for the bubble array is " + getMedian(bArray));
		System.out.println("");
		System.out.println("The unsorted arrayList for selection sort is: ");
		randomArr(sArray, 100);
		printArr(sArray);
		System.out.println("");
		System.out.println("The sorted arrayList for selection sort is: ");
		sortS(sArray);
		printArr(sArray);
		System.out.println("");
		System.out.println("The median for the selection array is " + getMedian(sArray));
		System.out.println("The unsorted arrayList for insertion sort is: ");
		randomArr(iArray, 100);
		printArr(iArray);
		System.out.println("");
		System.out.println("The sorted arrayList for insertion sort is: ");
		sortI(iArray);
		printArr(iArray);
		System.out.println("");
		System.out.println("The median for the insertion array is " + getMedian(iArray));
	}
	public static void randomArr(ArrayList<Integer> arr, int c) {
		for(int i = 0; i < c; i++) {
			int x = (int)(Math.random()*100);
			arr.add(x);
		}
	}
	public static void printArr(ArrayList<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
	public static void sortB (ArrayList<Integer> arr) {
		for(int outer = 0; outer < arr.size(); outer++) {
			for(int inner = 0; inner < arr.size() - outer - 1; inner++) {
				if(arr.get(inner) > arr.get(inner + 1)) {
					int temp = arr.get(inner);
					arr.set(inner, arr.get(inner + 1));
					arr.set(inner + 1, temp);
				} 
			}
		}
	}
	public static void sortS(ArrayList<Integer> arr) {
		int outer, inner, min_index;
		for(outer = 0; outer < arr.size(); outer++) {
			min_index = outer;
			for(inner = outer + 1; inner < arr.size(); inner++) {
				if(arr.get(inner) < arr.get(min_index)) {
					min_index = inner;
				}
			}
			int temp = arr.get(outer);
			arr.set(outer, arr.get(min_index));
			arr.set(min_index, temp);
		}
	}
	public static void sortI(ArrayList<Integer> arr) {
		int outer, inner, key;
		for(outer = 1; outer < arr.size(); outer++) {
			key = arr.get(outer);
			inner = outer - 1;
			while(inner >= 0 && arr.get(inner) > key) {
				arr.set(inner + 1, arr.get(inner));
				inner = inner - 1;
			}
			arr.set(inner + 1, key);
		}
	}
	public static double getMedian(ArrayList<Integer> arr) {
		if(arr.size() % 2 == 0) {
			int x = arr.size() / 2;
			return arr.get(x);
		}
		if(arr.size() % 2 != 0) {
			int r = arr.size() / 2;
			int x = (int)Math.round(r);
			return arr.get(x);
		}
		return 1;
	}
}
