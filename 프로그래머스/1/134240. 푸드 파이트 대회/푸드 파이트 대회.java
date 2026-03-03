class Solution {
        public String solution(int[] food) {
            //음식이 346이면 1223330333221
            String answer = "";
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i < food.length; i++) { //num = 1,2,3
                int num = food[i] /2;
                for (int j = 0; j < num; j++) {
                    builder.append(i); // 음식의 번호(i)를 개수(count)만큼 추가
                }

            }
            answer = builder.toString() + "0" + builder.reverse().toString();
            return answer;

        }
    }