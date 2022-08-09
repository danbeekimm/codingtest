package codingtest;
//2438
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine()) ;
		String star = "";
		for (int i = 0; i < n; i++) {
			star = star+'*';
			bw.write(star+"\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
