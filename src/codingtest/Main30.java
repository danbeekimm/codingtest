package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());
		int[] arr; //�л� �� ���� �迭
		StringTokenizer st;
		
		for (int i = 0; i < C; i++) {
			int N=0;
			double wellstudent=0; //��ճѴ��л���
			int test =0;
			double tot=0;
		
			st = new StringTokenizer(br.readLine()," ");
			N = Integer.parseInt(st.nextToken());
			arr = new int[N]; //�л��� �迭�� ���
//			System.out.println(N);
			
			double sum =0;
			
			for (int j = 0; j < N; j++) {
				test = Integer.parseInt(st.nextToken());//����
				arr[j]= test;
				sum += test; //������
			}
//			System.out.println("sum"+sum);
//			System.out.println("test"+test);
			tot = (sum/N);
			for (int j = 0; j < N; j++) {
				if (arr[j]>tot) {
					wellstudent++;
				}
			}
		System.out.printf("%.3f%%\n",(wellstudent/N)*100);
		}
	}

}
