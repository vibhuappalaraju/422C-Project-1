// SortTools.java 
/*
 * EE422C Project 1 submission by
 * Replace <...> with your actual data.
 * Vibhu Appalaraju
 * vka249
 * 16235
 * Spring 2017
 * Slip days used: 
 */

package assignment1;
import java.util.*;
public class SortTools {
	/**
	  * This method tests to see if the given array is sorted.
	  * @param x is the array
	  * @param n is the size of the input to be checked
	  * @return true if array is sorted
	  */
	public static boolean isSorted(int[] x, int n) {
		if(x.length==0 || n==0){
			return false;
		}
		for(int i=0;i<n-1;i++){
			if(x[i]<x[i+1]){
				
			}
			else {return false; }
		}
		return true;
		
	}
	
	/**
	 * This method finds the element v in array x of length n and then returns the index. 
	 * @param x is the array
	 * @param n is the size of the input to be checked
	 * @param v is the number to be searched for in the array x
	 * @return the index of where v is in the array x and if its not there it returns -1
	 */
static	int find(int[] x, int n, int v){
		int beg=0; // beg is the beginning index of the array x of size n 
		int mid=(n-1)/2; // mid is the middle index of the array x of size n
		int end=n-1; //  end is the end index of the array x of size n 
		if (v == x[mid]) { // if v is the middle number of the array x return middle index 
			return mid;
		}
		if (v == x[beg]) { // if v is the beginning number of the array x return beginning index 
				return beg;
			}
		if (v == x[end]) { // if v is the end number of the array x return end index 
				return end;
			}
		while ((x[mid]!= x[beg]) && (x[mid] != x[end])){ // while the middle index does not equal beginner index or the middle index equal the end index
			if (v == x[mid]) {
				return mid;
			}
			
			else if (v > x[mid]) { //  checks if the number is greater than the middle number of the array x 
				beg = mid; // if v is on the right half of the array x , our beginning index becomes the middle
				mid = (beg +end)/2; // the middle is now the middle of the new beginning ^ and the end
			}
			else if (v < x[mid]) {  //  checks if the number is less than the middle number of the array x 
				end = mid; // if v is on the left half of the array x , our end index becomes the middle
				mid =(end+beg)/2; // the middle is now the middle of the new end ^ and the beginning
			}
			
		}
		if (v == x[mid]) { //recheck
			return mid;
		}
		if (v == x[beg]) { // recheck
			return beg;
		}
		if (v == x[end]) { // recheck
			return end;
		}
		return -1;
		
		
		
		
	}
	/**
	 * This method inserts the number v in the array x if it is not already there (x is a sorted array) and if it is there then creates a new array with the same elements
	 * @param x is the array 
	 * @param n is the size of the input to be checked
	 * @param v is the number to be inserted if it is not there.
	 * @return we return the array with v, if it initially had v we return a new array with the same elements if not, then we reutrn a new array with v inserted
	 */
static	int[] insertGeneral(int[] x,int n, int v){
		
		int y = find(x,n,v);
		if(y!=-1){
			int[] array = new int[n];
			for(int i=0; i<n;i++){
				array[i]=x[i];	
			}
			return array;
		}
		else{
			int[] array = new int[n+1];
			int i=0;
			int counter=0;
			while( i<n){
				
				if(v>x[i]){
					array[i]=x[i];	
					counter++;
					}
				else if(v<x[i] && v>x[i-1]){
					array[i]=v;
					
					
				}
				else{ array[i]=x[i-1]; 
					
				}
				i++;
			}
			if(counter==n){
				array[i]=v;
			}
			else {array[i]=x[i-1];}
			return array;
		}
		
	
	} 
	/**
	 * 
	 * @param x is the sorted array 
	 * @param n is the extent of the array that we look at 
	 * @param v is the number to be inserted
	 * @return
	 */
static int insertInPlace(int[] x,int n, int v){
	//System.out.println("#2 ");
		int y = find(x,n,v);
		
		if(y!=-1){
			return n; // we return n if v is already inside the array x 
		}
		else{ // if v is not in the array 
			
		int f= n;
		
		
		
		while(f>0){ // we start from the back and the array size is n+1 and we move all the elements one place to the right till we insert v
			if (x[f-1]>v){
				x[f]=x[f-1];
			}
			else {x[f]=v; 
			        break;}
			
			f--;
		}
		return n+1;
		}
		
	
	}
	/**
	 * 
	 * @param x is the array to be sorted
	 * @param n is the extent at which the array should be sorted.
	 */
	static void insertSort(int[] x,int n){
		for(int i=0;i<n;i++){
			int j=i;
			while(j>0 && x[j-1]> x[j]){// this is insert sort which checks the first two elements then the first three by comparing 2nd and third with each other then the first and second with each other and so on
				int p=x[j-1];
				x[j-1]=x[j];
				x[j]=p;
				j=j-1;
			}
			
		}
	}
	
	
	
	// more functions required
}
