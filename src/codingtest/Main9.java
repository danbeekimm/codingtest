package codingtest;
//2884
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = bc.readLine().split(" ");
		int H = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		if (M<45) {
			H --;
			M = 60-(45-M);
			if (H<0) {
				H =23;
				
			}System.out.println(H+" "+M);
		}else {
			System.out.println(H+" "+(M-45));
		}
	}

}
