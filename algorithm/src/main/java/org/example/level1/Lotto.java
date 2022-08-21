package org.example.level1;

import java.util.Arrays;

public class Lotto {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int n = 0;
        int countZero = 0;
        int count = 0;
        while (n < 6){
            if(lottos[n]==0){countZero++;}
            for(int i = 0; i < 6; i++){
                if(lottos[i] == win_nums[n]){
                    count++;
                }
            }
            n++;
        }

        answer[0] = count+countZero;
        answer[1] = count;

        for(int z=0; z<2; z++){
            if(answer[z] == 6){
                answer[z] = 1;
            }else if(answer[z] == 5){
                answer[z] = 2;
            }else if(answer[z] == 4){
                answer[z] = 3;
            }else if(answer[z] == 3){
                answer[z] = 4;
            }else if(answer[z] == 2){
                answer[z] = 5;
            }else {
                answer[z] = 6;
            }
        }
        return answer;
    }
}
