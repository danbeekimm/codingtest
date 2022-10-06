package codingtest;

import java.util.Arrays;
import java.util.Collections;

class Level9 {
	public long solution(long n) {
        String[] string = String.valueOf(n).split("");
        
        Arrays.sort(string, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        
        for(String s:string) {
        	sb.append(s);
        }
        
        return Long.parseLong(sb.toString());
    }
}
