package sorting;

import java.util.Arrays;

public class Selection {

	public static void main(String[] args) {
		int[] arr = {3,5,2,20,1,10};
		int min;
		for(int i=0; i < arr.length; i++) {
			min = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
				System.out.println("swapping "+ arr[i] + " " + arr[min]);
			}
		}
		System.out.println("sorted array "+ Arrays.toString(arr));
	}
}
