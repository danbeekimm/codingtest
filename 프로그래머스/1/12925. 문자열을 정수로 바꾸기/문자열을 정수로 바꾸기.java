class Solution {
    public int solution(String s) {
    	if(1 < s.length() && s.length() <= 5){
            return Integer.parseInt(s);
        };
        return 0;
    };
}