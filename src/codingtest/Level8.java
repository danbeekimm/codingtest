package codingtest;

public class Level8 {
	 public boolean solution(int x) {
	        int num =x;
	        int answer =0;
	        while(num>=1){
	            answer += num%10; //3
	            num /= 10; 
	        }
	        return x %answer ==0? true:false;

	    }
}
