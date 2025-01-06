package leetcode;

public class ContainerWithMostWater {
		public static int[] maxArea(int[] nums) {
			int left = 0;
			int right = nums.length-1;
			int area = 0;
			int highRight = 0;
			int highLeft = 0;
			while(left < right) {
			
				int distance = right-left;
				int minValue = Math.min(nums[left], nums[right]);
				int currentHighArea = minValue*distance;
				
				if(area < currentHighArea) {
					area = currentHighArea;
					highLeft = left;
					highRight = right;
				}
				
				if(nums[left] < nums[right] ) {
					left++;
				}else {
					right--;
				}
			
			}
			return new int[] {highLeft, highRight};
		}
		
		public static int calculateArea(int a, int b){			
			return a*b;
		} 
		
		public static void main(String[] args) {
			
			int[] arr = {1,8,6,2,5,4,8,3,7};
			int[] result = maxArea(arr);
			System.out.println(result[0]+" "+ result[1]);
		}
}
