package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main24 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int same = N ;
		int cnt =0;
		
		while (true) {
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			//N이 26 가정하면 앞은 60 + ((2)+(6)%10)
			cnt ++;
		if (same ==N) {
			break;
		}
		}
		System.out.println(cnt);
	}

}
