import java.util.Arrays;    
//[-2, 3, 0, 2, -5]
    class Solution {
        public int solution(int[] number) {
            int answer = 0;
            int num = 1;
            Arrays.sort(number); // -5 -2 0 2 3

            for (int i = 0; i <= number.length -3; i++) {
                //인덱스 설정
                int left = i + 1;
                int right = number.length - 1;

                while (left < right) {
                    int sum = number[i] + number[left] + number[right];
                    if (sum == 0) {
                        // 나머지 전부다같은
                        if (number[right] == number[left]) {
                            answer = answer + (right - left + 1) * (right - left) / 2;
                            break;
                        } else {
                            int leftCount = 1;
                            int rightCount = 1;
                            while (number[left] == number[left + 1]) {
                                leftCount++; // 왼쪽에서부터 몇개가 같은지 기록
                                left++; // 레프트 인덱스 한칸 이동
                                if (left == right) {
                                    break; // 레프트 라이트 만나면 강제종료
                                }
                            }
                            while (number[right] == number[right -1]) {
                                rightCount++; // 오른쪽에서부터 몇개가 같은지 기록
                                right--; // 라이트 인덱스 한칸 이동
                                if (left == right) {
                                    break; // 레프트 라이트 만나면 강제종료
                                }
                            }
                            answer = answer + leftCount * rightCount;
                            left++;
                            right--;
                        }
                    } else if (sum < 0) {
                        left = left + 1;
                    } else {
                        right = right - 1;
                    }
                }
            }
            return answer;
        }
    }