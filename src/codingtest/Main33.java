package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main33 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(count(N));
	}

	public static int count(int N) {
		//100보다 작으면 등차수열
		int cnt =0;
		if (N<100) {
			return N;
		}else {
			cnt=99;


			for (int i = 100; i <= N; i++) {
				int hun = i/100; //373/100 = 3
				int ten = (i/10)%10; //373/10=37  37%10=3
				int one = i%10 ; //375%10 = 5

				if ((hun-ten)==(ten-one)) {
					cnt ++;
				}
			}
		}
		return cnt;
	}
}
