package codingtest;
//15552
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main16 {
	public static void main(String[] args) throws IOException {
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(bc.readLine());
		
		StringTokenizer st;
		
		for (int i = 0; i < T; i++) {
			st=new StringTokenizer(bc.readLine()," "); //for�� �������� StringTokenizer ����, ���ڹ���.
			bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
		}
		bc.close();
		bw.flush(); //���� ����
		bw.close(); //���� �ݱ�
		
	}

}
