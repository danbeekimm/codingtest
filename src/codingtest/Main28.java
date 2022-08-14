package codingtest;

import java.util.Scanner;

public class Main28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		float[] b = new float[a];
		float max=0;
		float avg =0;
		
		for (int i = 0; i < b.length; i++) {
			b[i]=scanner.nextInt();
			if (b[i]>max) {
				max=b[i];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			avg += (b[i]/max*100)/a;
		}
		System.out.println(avg);
//		System.out.println(max);
	}

}
