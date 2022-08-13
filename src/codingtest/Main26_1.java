package codingtest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main26_1{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int max = -1000000;
		int num=0;
		for (int i = 0; i < 9; i++) {
			
			int s = Integer.parseInt(br.readLine());
			if (s>max) {
				max=s;
				num = i+1;
			}
			
		}
		
		sb.append(max);
		sb.append(" ");
		sb.append(num);
		
		System.out.println(sb);
	}

}