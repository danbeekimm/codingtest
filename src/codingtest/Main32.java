package codingtest;

import java.util.Iterator;

public class Main32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] bl = new boolean[10001];
		
		for (int i = 1; i < bl.length; i++) {
			int a=d(i);
			if (a<10001) {
				bl[a] = true;
			}
		}
		for (int i = 1; i < bl.length; i++) {
			
			if (bl[i]==false) {
				System.out.println(i);
			}
		}
	
	}
		
	private static int d(int i) {
		// TODO Auto-generated method stub
		int sum = i;
		
		while (i > 0) {//33
			sum += i%10;//3
			i = i/10; //3
		}
		return sum;
	}

}
