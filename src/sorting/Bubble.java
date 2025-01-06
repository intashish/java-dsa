package sorting;

import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int[] arr = {2,5,4,6,8,1,9};
		boolean swap;
		for(int i = 0; i < arr.length; i++) {
			swap = false;
			for(int j = 0; j < arr.length - i; j++) {			
				if(j < arr.length - 1 && arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					System.out.println("swaping " + arr[j]+" "+arr[j+1]);
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
