package codingtest;


import java.util.Arrays;


public class Level2 {

	public int level2(int[]arr) {
		return (int)Arrays.stream(arr).average().
				orElse(0);
		//orElse�� null�̴����� �׻� �Ҹ�.
	}
	public static void main(String[] args) {
		int x[]= {5,4,3}; //test �迭
		Level2 level2 = new Level2(); //��ü������
		System.out.println(level2.level2(x)); //���

	}

}

