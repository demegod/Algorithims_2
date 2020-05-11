import java.util.Arrays;
import java.util.Random;

/**
 * CSC 331 Programming Assignment 2
 * Method 3
 *
 * @author Scott Spurlock
 * @version 3/15/17
 * Modified by Dimitrios Vlahos
 */
public class Method3 {
	// For finding a random pivot in the partition method.
	private Random randGen = new Random();

	/**
	 * This method finds the k largest elements in an integer array
	 * by calling the selection method to find the location of the
	 * (n-k)th element, copying the k largest elements into an array,
	 * and then calling insertion sort on this array to put them in order.
	 * 
	 * @param arr: input array to be searched
	 * @param k: how many elements to select
	 * @return an array of size k holding the largest k elements of A
	 */
	public int[] findTopK(int[] arr, int k) {
		int[] results = new int[k];
		int smallestPivotIndex = selection(arr, arr[0], arr[arr.length-1], arr.length-k);

		while (k > 0){
			
			k--;
		}
		return results;
	}

	/**
	 * Return kth smallest element of array A between left..right
	 * @param A: input array of ints
	 * @param left: index of the left-most element to be considered
	 * @param right: index of the right-most element to be considered
	 * @param k: the order of the element to find
	 * @return final index of the pivot element
	 */
	public int selection(int[] A, int left, int right, int k) {
		boolean[] tracker = new boolean[A.length];
		
		int min_index = 0;
		while(k > 0){
			for (int i = left-1; i < A.length-2; i++){
				if (tracker[i] == false){
					min_index = i;
				}
				for (int j = right; i < A.length-1; j++){
					if (tracker[i] == false){
						if (A[j] < A[min_index]){
							min_index = j;
						}
					}
				}
			}
			for (int i = 0; i < tracker.length; i++){
				
				if (A[i] == min_index){
					tracker[i] = true;
				}
				if (tracker[i] != true){
					tracker[i] = false;
				}
			}
			k--;
		}
		return min_index;
	}
	
	/**
	 * Partition the elements of an array A between left and right
	 * so that, for some pivot element, all the elements to its left
	 * are less and all the elements to its right are greater.
	 * Recommendation: pick the index of the pivot element randomly.
	 * 
	 * @param A: input array of ints
	 * @param left: index of the left-most element to be considered
	 * @param right: index of the right-most element to be considered
	 * @return final index of the pivot element
	 */
	public int partition(int[] A, int left, int right) {
		int pivot = A[A.length];
		int i = left-1;
		int j = right;
		
		while(true){
			while(A[++i] < pivot) {
				if (i == right) break;
			}
			while(A[--j] >= pivot) {
				if (j == left) break;
			}
			if (i >= j) {
				break;
			}
			swap(A,i,j);
		}
		
		swap(A, i, right);
		return i;
	}

	/**
	 * Helper method to swap two elements in an array.
	 * @param A: array
	 * @param a: first index
	 * @param b: second index
	 */
	public  void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}	

	/**
	 * Sort the elements in the array A using insertion sort.
	 * @param A: input array of ints.
	 */
	public void insertion_sort(int[] A) {
		for (int i = 1; i < A.length-1; i++){
			int v = A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j = j-1;
			}
			A[j+1] = v;
		}
	}
	
} // Method3
