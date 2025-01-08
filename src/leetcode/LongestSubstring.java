package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

//	NOTE: There is more readable solution on leetcode
//	 if (s == null || s.length() == 0) {
//         return 0;
//     }
//
//     // Initialize pointers and a HashSet for tracking characters in the window
//     int left = 0, right = 0, maxLength = 0;
//     HashSet<Character> seen = new HashSet<>();
//
//     // Expand the window with the right pointer
//     while (right < s.length()) {
//         char c = s.charAt(right);
//
//         // If the character is already in the set, shrink the window from the left
//         while (seen.contains(c)) {
//             seen.remove(s.charAt(left));
//             left++;
//         }
//
//         // Add the current character to the set and update maxLength
//         seen.add(c);
//         maxLength = Math.max(maxLength, right - left + 1);
//
//         // Move the right pointer
//         right++;
//     }
//
//     return maxLength;
	
	public static void main(String[] args) {
//		String s = "abcabcdbb";
		String s = "";
		if(s.length() == 0) {
			System.out.println(0);
			return;
		}
		String[] stringArray = s.split("");
		int j = 0, i = 0, longestCount = 0;
		
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while(j < stringArray.length) {
			if(map.containsKey(stringArray[j])) {
				int index = map.get(stringArray[j]);
				while(i <= index) {
					map.remove(stringArray[i]);
					i++;
				}
			}
			map.put(stringArray[j], j);
			int count = j - i + 1;
			if(count > longestCount) {
				longestCount = count;
			}
			j++;
		}
		System.out.println(longestCount);
	}
}
