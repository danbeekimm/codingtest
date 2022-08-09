package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//11021
public class Main17 {

	public static void main(String[] args) throws  IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		StringTokenizer st;
//		String sb="";
//		for (int i = 0; i < T; i++) {
//			
//			st = new StringTokenizer(br.readLine()," ");
//			
//			sb += "Case #"+(i+1)+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()) + "\n");
//		}
//		br.close();
//		System.out.println(sb);
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine()," ");
			
			sb.append("Case #");
			sb.append(i+1);
			sb.append(": ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append("\n");
			
			
		}bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
		System.out.println(bw);
	}

}
