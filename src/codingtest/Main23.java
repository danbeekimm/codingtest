package codingtest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main23 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		try {
//			StringTokenizer st;
//			String n = "";
//			
//			while((n=br.readLine()) != null) {
//				st = new StringTokenizer(n);
//				if(st.hasMoreTokens()) {
//				bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
//				}else {
//					break;
//				}
//			}
//
//			br.close();
//			bw.flush();
//			bw.close();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringBuilder sb = new StringBuilder();
	      
	      String input;
	      
	      while ((input = br.readLine()) != null && !input.isEmpty()) {
	         StringTokenizer st = new StringTokenizer(input);
	         
	         sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
	         sb.append("\n");
	      }
	      
	      System.out.println(sb);
	   

		
		
		//Scanner ¹æ¹ý
//		  StringBuilder sb = new StringBuilder();
//		 Scanner sc=new Scanner(System.in);
//	         while (sc.hasNextLine()) {
//	            String input = sc.nextLine();
//
//	            if (input.isEmpty()) {
//	               break;
//	            }
//
//	            StringTokenizer st = new StringTokenizer(input);
//	            int a = Integer.parseInt(st.nextToken());
//	            int b = Integer.parseInt(st.nextToken());
//
//	            sb.append(a + b).append("\n");
//	         }
//
//	         sc.close();
//	         System.out.println(sb);
	}

}
