    class Solution {
        public int solution(int n, int m, int[] section) {
            //n이 벽 길이 m 이 롤러길이 section이 칠해야할 곳
            //2
            int start = section[0];
            int answer = 0;
            //2,3,6
            for (int item : section) {
                if(item >= start){
                    answer ++;
                    start = item + m;
                }
            }
            return answer;
        }
    }