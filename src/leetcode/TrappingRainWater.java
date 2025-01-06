package leetcode;

public class TrappingRainWater {

	public static void main(String[] args) {

		//BRUTE FORCE (FAILED IN LEETCODE TESTCASE - TIME EXCEEDS)
//		int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
		int[] arr = {4,2,0,3,2,5};
		
		int totalWater = 0;
		for(int p=0; p < arr.length; p++) {
			int leftP = p;
			int rightP = p;
			int maxLeft = 0;
			int maxRight = 0;
			while(leftP >= 0) {
				maxLeft = Math.max(maxLeft, arr[leftP]);
				leftP--;
			}
			
			while(rightP < arr.length) {
				maxRight = Math.max(maxRight, arr[rightP]);
				rightP++;
			}
			int currentWater = Math.min(maxLeft, maxRight) - arr[p];
			if(currentWater >= 0) {
				totalWater +=  currentWater;
			}
		}
		System.out.println(totalWater);
		
		
//		int[] arr1 = {0,1,0,2,1,0,1,3,2,1,2,1};
//		int pl = 0;
//		int pr = arr1.length-1;
//		int maxLeft = 0;
//		int maxRight = 0;
		//just remember which ever side is smaller we are going to move it
		//try this later
		
	}

}
