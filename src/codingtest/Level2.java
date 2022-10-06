package codingtest;


import java.util.Arrays;


public class Level2 {

	public int level2(int[]arr) {
		return (int)Arrays.stream(arr).average().
				orElse(0);
		//orElse는 null이던말던 항상 불림.
	}
	public static void main(String[] args) {
		int x[]= {5,4,3}; //test 배열
		Level2 level2 = new Level2(); //객체생성후
		System.out.println(level2.level2(x)); //출력

	}

}

