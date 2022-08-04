package codingtest;
//1330
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
	
		int A = Integer.parseInt(s[0]);
		int B = Integer.parseInt(s[1]);
		System.out.println((A>B)?">":(A<B)?"<":"==");	
		}
	
	}