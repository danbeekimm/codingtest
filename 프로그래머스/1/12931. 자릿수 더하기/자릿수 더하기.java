import java.util.*;
import java.util.Scanner;

public class Solution {
    
    public int solution(int n) {
	       int answer =0;
		
            while(n !=0) {
                answer = answer + n%10;
                n = n/10;
            }
		return answer;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		Solution solution = new Solution();
		System.out.println(solution.solution(N));

	}
}