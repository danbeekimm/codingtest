package codingtest;
//2525
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.chrono.MinguoChronology;
import java.util.StringTokenizer;


public class Main10 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer arr = new StringTokenizer(bc.readLine()," ");
		int H = Integer.parseInt(arr.nextToken());
		int M = Integer.parseInt(arr.nextToken());
		int C = Integer.parseInt(bc.readLine());
		

		int min = H*60+M;
		min = min +C;
		
		int hour = (min/60)%24;
		int minute = min%60;
		
		System.out.println(hour+" "+minute);
	}

}
