package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		
		if (A%4==0) {
			if (A%400==0) {
				System.out.println("1");
			}else if (A%100==0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		}
		else {
			System.out.println("0");
		}
	}

}
