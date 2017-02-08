/* 
 * This file is how you might test out your code.  Don't submit this, and don't 
 * have a main method in SortTools.java.
 */

package assignment1;

import java.util.Arrays;

public class Main {
	public static void main(String [] args) {
  
		int[] x = new int[]{10, 20, 30, 40, 50};
		int[] p =SortTools.insertGeneral(x, 3, 35);
		for(int i=0; i<p.length; i++){
			
			System.out.print(p[i]+" ");
			
		}
		
		int[] array = {0,4,2,3,5,10,6,7,8,9};
		SortTools.insertSort(array, 10);
		System.out.println("#1 " + Arrays.toString(array));
		int[] array1 = {0,1,2,3,5,6,7,8,9,0};
		SortTools.insertInPlace(array1, 9, 4);
		System.out.println("#2 " + Arrays.toString(array1));
		int[] array2 = {0,2,3,4,5,6,7,8,9,10};
		System.out.println("#3 " + SortTools.find(array2, 10, 1));
		System.out.println("#4 " + SortTools.find(array2, 10, 10));
		int[] array3 = {0,1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i = 0; i < 13; i++){
			if(i != SortTools.find(array3, 13, i)){
				System.out.println("error 5");
			}
		}
		System.out.println("#5 complete");
		for(int i = 0; i < 12; i++){
			if(i != SortTools.find(array3, 12, i)){
				System.out.println("error 6");
			}
		}
		System.out.println("#6 complete");
		for(int i = 0; i < 11; i++){
			if(i != SortTools.find(array3, 11, i)){
				System.out.println("error 7");
			}
		}
		System.out.println("#7 complete");
		for(int i = 0; i < 10; i++){
			if(i != SortTools.find(array3, 10, i)){
				System.out.println("error 8");
			}
		}
		System.out.println("#8 complete");
		SortTools.insertInPlace(array1, 10, 2);
		System.out.println("#9 " + Arrays.toString(array1));
		int[] array4 = {0,1,2,3,9,6,7,8,9,10};
		int[] array5 = {0,1,2,3,5,6,7,8,9,10};
		System.out.println("#10 " + SortTools.isSorted(array4, 10));
		System.out.println("#11 " + SortTools.isSorted(array5, 10));
		int[] array6 = {1,5,2,7,9,3,7,5};
		SortTools.insertSort(array6, 8);
		System.out.println("#12 " + Arrays.toString(array6));
		int[] array7 = {1,2,3,5,6};
		int[] array8 = SortTools.insertGeneral(array7, 5, 4);
		System.out.println("#13 " + Arrays.toString(array8));
	
		// call your test methods here
		// SortTools.isSorted() etc.
	}
}
