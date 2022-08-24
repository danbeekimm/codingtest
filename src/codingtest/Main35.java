package codingtest;

import java.util.Scanner;

public class Main35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		String B = sc.next(); //문자열로받기
		
		sc.close();
		
		int sum=0;
		
		for (int i = 0; i < A; i++) {
			sum += B.charAt(i)-48; 
		}
		System.out.println(sum);
	}

}
