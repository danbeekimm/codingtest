package codingtest;



class Level3 {

	public int level3(int num) {
	int answer=0;
	int sum=0;
	for (int i = 1; i <=num/2; i++) {
		if (num%i==0) answer += i;
		sum = answer+num;
	}
	
		return sum ;
	}
	
	public static void main(String[] args) {
		Level3 level3 = new Level3();
		System.out.println(level3.level3(12));

	}

}
