package codingtest;
//2480
import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result;
		
		if (A==B && B==C && A==C) {
			result = 10000+A*1000;
		}else if (A==B || A==C) {
			result = 1000+A*100;
		}else if (B==C) {
			result = 1000+B*100;
		}else {
			result = Math.max(A, Math.max(B,C))*100;
		}
		System.out.println(result);
		sc.close();
	}
}
