package problems;

public class Problem2 {
	public int input(String S) {
		int result = 0;
		
			for(int i = 0; i<S.length();i++) {
				try {
				result+=Integer.parseInt(S.charAt(i)+"");
				}catch(Exception e) {
					
				}
				
			}
		
		return result;
	}
}
