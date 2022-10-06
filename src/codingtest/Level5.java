package codingtest;

import java.util.Scanner;

class Level5 {

	public long solution(long n) {
        long answer = 0;
        long x=1;
        while(x!=0) {
        if (n==x*x) {
			answer = (x+1)*(x+1);
			x=0;
		}else if(x*x>n){
			x=0;
			answer = -1;
		}else {
			x++;
		}
        }
        return answer;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		Level5 level5 = new Level5();
		System.out.println(level5.solution(n));

	}
	

//	Math.pow:Á¦°öÇÔ¼ö (11,2) ¸é 11ÀÇ Á¦°ö
	//.sqrt: Á¦°ö±Ù
//class Solution {
//  public long solution(long n) {
//      if (Math.pow((int)Math.sqrt(n), 2) == n) {
//            return (long) Math.pow(Math.sqrt(n) + 1, 2);
//        }
//
//        return -1;
//  }
//}

}
