package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main29 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = 0; i < T; i++) {
		
			int cnt =0;
			int sum =0;
			
			for (byte value: br.readLine().getBytes()) {
				
				if (value == 'O') {
					cnt++;
					sum += cnt;
				}else {
					cnt = 0;
				}
			}
			
			sb.append(sum);
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
