package codingtest;
//2562
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main26 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int num = 0;
		for (int i = 0; i < 9; i++) {
			int s = Integer.parseInt(br.readLine());
			if (s>max) {
				max=s;
				num = i+1;
			}
		}
		System.out.println(max);
		System.out.println(num);
	}

}
