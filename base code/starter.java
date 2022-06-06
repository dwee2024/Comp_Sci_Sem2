import java.util.ArrayList;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		int[][] array = {{1,2,3,4},{5,6,7,8}};
		for(int[] i: array) {
			for(int x : i) {
				System.out.println(x + " ");
			}
		}
	}
}
