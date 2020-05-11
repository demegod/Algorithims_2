
/**
 * CSC 331 Programming Assignment 2
 * Method 1
 *
 * @author Scott Spurlock
 * @version 3/15/17
 * Modified by Dimitrios Vlahos
 */
public class Method1 {

	/**
	 * This method finds the k largest elements in an integer array
	 * by looping through the array k times, each time picking the largest.
	 * 
	 * Recommendation:
	 * To make sure we don't pick the same largest element more than once,
	 * declare an array of booleans to keep track of which elements
	 * have been selected.
	 *
	 * @param arr: input array to be searched
	 * @param k: how many elements to select
	 * @return an array of size k holding the largest k elements of A
	 */
	public int[] findTopK(int[] arr, int k) {
		int[] results = new int[k];
		boolean[] tracker = new boolean[arr.length];
		
		while(k > 0){
			int largest = arr[0];
			for (int i = 0; i < arr.length; i++){
				if (tracker[i] == false){
					if (arr[i] > largest){
						largest = arr[i];
					}
				}
			}
			
			for (int i = 0; i < tracker.length; i++){
				
				if (arr[i] == largest){
					tracker[i] = true;
				}
				if (tracker[i] != true){
					tracker[i] = false;
				}
			}
			
			results[k-1] = largest;
			k--;
		}

		// TBD
		
		return results;
	}


} // Method1
