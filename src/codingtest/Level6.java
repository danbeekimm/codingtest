package codingtest;

import java.util.Scanner;


class Level6 {

	 public int[] solution(long n) {
		 String string = String.valueOf(n);
		 
		 StringBuilder sb = new StringBuilder(string);
		 sb.reverse(); //µÚÁý±â
		 
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
		Level6 level6 = new Level6();
		System.out.println(level6.solution(n));

	}

}
