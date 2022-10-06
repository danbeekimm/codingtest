package codingtest;

public class Level1 {
	String EvenOdd(int num) {
		return num %2==0?"Even":"Odd";
	}
	
	
	public static void main(String[] args) {
		Level1 evenodd = new Level1();
		
		System.out.println(evenodd.EvenOdd(3));
		System.out.println(evenodd.EvenOdd(2));
	}

}
