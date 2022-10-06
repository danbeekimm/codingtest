package codingtest;

import java.util.Scanner;


public class Level4 {
	
	public int solution(int n) {
	
		int answer =0;
		
		while(n !=0) {
			answer +=n%10;
			n/=10;
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		Level4 level4 = new Level4();
		System.out.println(level4.solution(N));

	}

}
