class Solution {
    public long solution(int a, int b) {
        long max = Math.max(a,b);
        long min = Math.min(a,b);
      return (min+max)*(max-min+1)/2;
   }
}


