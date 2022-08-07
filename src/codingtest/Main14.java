package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(bc.readLine());
		int sum=0;
		for (int i = 1; i <= A; i++) {
			sum += i;
		
		} System.out.println(sum);
	}

}
