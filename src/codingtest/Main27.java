package codingtest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main27 {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> hs = new HashSet<Integer>();
		//hashset : 중복을 허용하지않고, 순서개념이없다. 정렬이안됨.
		for (int i = 0; i < 10; i++) {
			
			hs.add(Integer.parseInt(br.readLine())%42);
		}
		
		System.out.println(hs.size());

	}

}
