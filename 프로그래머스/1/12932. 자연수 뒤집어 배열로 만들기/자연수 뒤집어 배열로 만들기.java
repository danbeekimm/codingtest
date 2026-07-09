import java.util.Scanner;

class Solution {
    
	 public int[] solution(long n) {
		 String string = String.valueOf(n);
		 
		 StringBuilder sb = new StringBuilder(string);
		 sb.reverse(); //뒤집기
		 
		 String[]stringArr= sb.toString().split("");
		 
		 int[]answer = new int[sb.length()];
		 
	     for (int i = 0; i < sb.length(); i++) {
			answer[i]=Integer.parseInt(stringArr[i]);
		}
	        return answer;
	    }
	 
	 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Solution solution = new Solution();
		System.out.println(solution.solution(n));

	}

}