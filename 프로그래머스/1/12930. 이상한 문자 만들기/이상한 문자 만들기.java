class Solution {
        public String solution(String s) {
            int idx = 0;
            StringBuilder sb = new StringBuilder();
            for (char str : s.toCharArray()) {
                if (str == ' '){
                    idx =0;
                }else {
                    if (idx % 2  == 0){
                        str = Character.toUpperCase(str);
                    }else {
                        str = Character.toLowerCase(str);
                    }
                    idx ++;
                }
                sb.append(str);
            }
            return String.valueOf(sb);
        }
    }