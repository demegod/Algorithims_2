/**
 * CSC 331 Programming Assignment 2
 * This is the driver class that will create instances of
 * the 3 method classes to test them.
 *
 * @author Scott Spurlock
 * @version 3/15/17
 * Modified by Dimitrios Vlahos
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PA2 {

	public static void main(String[] args) throws IOException {
		Method1 method1 = new Method1();
		Method2 method2 = new Method2();
		Method3 method3 = new Method3();

		// -----------------------------------------------------
		// Functionality Tests
		// Test each method on the provided test data, which consists of
		// 100 integers (one per line). Use k = 10. Include the output from
		// each method in your readme file.
		System.out.println("Functionality Tests...");
		
		// A. Read test data from file into array
		
		int temp = 0;
		
		Scanner input = new Scanner(new File("pa2_input.txt"));
		
		ArrayList<Integer> in = new ArrayList<Integer>();
		
		while (input.hasNextInt()){
			temp = input.nextInt();
			in.add(temp);
		}
		
		input.close();
		
		int[] inputArray = new int[in.size()];
		
		for(int i = 0; i < in.size(); i++){
			if (in.get(i) != null){
				inputArray[i] = in.get(i);
			}
		}
		// B. Test each method with the same test data. 
		// (Make sure to clone the array for testing each method so the original isn't changed.)
		
//		System.out.println("Test1...");
//		int [] answers = method1.findTopK(inputArray, 10);
//		
//		for (int k : answers){
//			System.out.println(k);
//		}
		
//		System.out.println("Test2...");
//		int [] answers = method2.findTopK(inputArray, 10);
//		for (int k : answers){
//			System.out.println(k);
//		}
		
//		System.out.println("Test3...");
//		int[] newArray = method3.findTopK(inputArray, 10);
//		method3.insertion_sort(newArray);
//		...
		
		// -----------------------------------------------------
		// Timing Tests
		// Use a random number generator to generate 10,000 elements and run 
		// the three different algorithms to find the 500 largest elements. 
		// Take the average over 10 experiments for each algorithm and compare the results.
		System.out.println();
		System.out.println("Timing Tests...");
		int K = 500;
		Random rand = new Random();
		int[] largeArray = new int[10000];
		for (int i = 0; i < largeArray.length; i++){
			largeArray[i] = rand.nextInt();
		}
		// Run tests to time each method on random data

		// A. For each experiment, create an array of 10,000 random integers
		// Make sure to clone the array for testing each method so the original isn't changed.
		// Use System.nanoTime() to get the runtime for each method.
		// E.g., 
		//			int[] output = new int[K];
		//			long start = System.nanoTime();
		//			output = method1.findTopK(testData1, K);
		//			long end = System.nanoTime();
		//			long timeResults1 = end - start;
//		System.out.println("Test1...");
//		int[] output = new int[K];
//	    long start = System.nanoTime();
//		output = method1.findTopK(largeArray, K);
//		long end = System.nanoTime();
//		long timeResults1 = end - start;
//		
//		System.out.println("Time to run: " + timeResults1);
//		
//		System.out.println("Test2...");
//		int[] output = new int[K];
//	    long start = System.nanoTime();
//		output = method2.findTopK(largeArray, K);
//		long end = System.nanoTime();
//		long timeResults2 = end - start;
//		
//		System.out.println("Time to run: " + timeResults2);
		

	} // end main
}
