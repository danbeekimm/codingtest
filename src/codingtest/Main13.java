package codingtest;
//10950
//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;
//import java.util.StringTokenizer;

public class Main13 {

	public static void main(String[] args) throws IOException {
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int A = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
//		
//		for (int i = 0; i < A; i++) {
//			st = new StringTokenizer(br.readLine()," ");
//			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
//			sb.append('\n');
//		
//		}
//		System.out.println(sb);
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int a[] = new int[A];
		
		for (int i = 0; i < A; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			a[i] = b+c;
		}
		
		for (int k :a) {
			System.out.println(k);
		}
		
		
		
	}

}
