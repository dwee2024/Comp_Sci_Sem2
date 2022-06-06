import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {

	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public void 3mergeSort(int [] A, int []B, int [] C){
		
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public void mergeSort(int [] A, int first, int last){
		
	}
	
	public void randArray(int[] A) {
		for(int i = 0; i < A.length; i++) {
			int r = (int)(Math.random() * 100);
			A[i] = r;
		}
	}
	
	public static sort(int [] a) {
		for(int outer = 0; outer < a.length; outer++) {
			for(int inner = 0; inner < a.length - outer - 1) {
				for(a[inner] > a[inner + 1]) {
					int temp = a[inner];
					a[inner] = a[inner + 1];
					a[inner + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String args[]) {

		
	}
}
