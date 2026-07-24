import java.util.ArrayList;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        int a = x;
        while (a>0){
            arr.add(a % 10);
            a = a/10;
        }
        for(int i=0; i < arr.size(); i++){
            sum = sum + arr.get(i);
        }
        if(x % sum != 0){
            answer = false;
        }
        return answer;
    }
}