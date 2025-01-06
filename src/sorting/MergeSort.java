package sorting;

import java.util.Arrays;

public class MergeSort {

	//here we will merge
	static void merge(int[] arr, int middle, int left, int right) {
		int n1 = middle - left + 1;
		int n2 = right - middle;
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];
		
		//copying array to left and right array
		for(int i=0; i < n1; i++) {
			leftArr[i] = arr[left+i];
		}
		
		for(int j=0; j < n2; j++) {
			rightArr[j] = arr[middle + 1 + j];
		}
		
		//Merge two sub array
		int i = 0, j = 0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
				k++;
			}else {
				arr[k] = rightArr[j];
				j++;
				k++;
			}
		}
		
		// Copy remaining element into array if any remaining!
		if(i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		if(j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
	
	//here we will divide the array into half till 1 or 0 element is remaining
	static void sort(int[] arr, int left, int right){
		if(left < right) {			
			int middle = left + (right-left)/2;
			
			sort(arr, left, middle);
			sort(arr, middle+1, right);
			merge(arr, middle, left, right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = { 2,10,4,5,23,11};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
