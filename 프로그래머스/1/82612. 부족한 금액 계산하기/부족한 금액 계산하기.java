class Solution {
    public long solution(int price, int money, int count) {
        long tot = 0 ;
        long answer = 0;
        for(int i=1; i<count+1; i++){
            tot += price*i;
        }
        if(tot>money){
            answer = tot-money;
        }else{
            answer = 0;
        }
        return answer;
    }
}