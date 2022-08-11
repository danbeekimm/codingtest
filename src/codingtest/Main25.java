package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main25 {

	public static void main(String[] args) throws  IOException {
//		// TODO Auto-generated method stub
//		Scanner sr = new Scanner(System.in);
//		int n = sr.nextInt();
//		int[] arr = new int[n];
//		
//		for (int i = 0; i < n; i++) {
//			arr[i] = sr.nextInt();
//			
//		}
//		sr.close();
//		Arrays.sort(arr); // 오름차순 정렬해줌. Arrays.sort
//		System.out.println(arr[0] + " "+ arr[n-1]); //0부터 시작이므로
//		

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num = 0;
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
			num ++;
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
	}

}
