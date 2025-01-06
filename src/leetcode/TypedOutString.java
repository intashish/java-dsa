package leetcode;

public class TypedOutString {

	public static void main(String[] args) {
		String s = "ab#c"; 
		String t = "ad##c";
		String[] sArr = s.split("");
		String[] tArr = t.split("");
		int ps = s.length() - 1;
		int pt = t.length() - 1;
		
		while(ps >= 0 || pt >= 0) {
			if(sArr[ps].equals("#") || tArr[pt].equals("#")) {
				if(sArr[ps].equals("#")) {
					int skip = 2;
					while(skip > 0 && ps>0) {
						ps--;
						skip--;
						System.out.println("ps "+ps);
						if(sArr[ps].equals("#")) {
							skip = skip+ 2;
						}
					}
				}
				if(tArr[pt].equals("#")) {
					int skip = 2;
					while(skip > 0 && pt>0) {
						pt--;
						skip--;
						System.out.println("pt "+ pt);
						if(tArr[pt].equals("#")) {
							skip =skip+ 2;
						}
					}
				}
			}else {
				if(sArr.length ==0 && sArr.length == 0) {
					
				}
				if(!sArr[ps].equals(tArr[pt])) {
					return;
				}else {
					ps--;
					pt--;
				}
			}
		}
		
		return;
	}
}
