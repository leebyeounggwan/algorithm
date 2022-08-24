package org.example.level1;

import java.util.ArrayList;

public class Trit {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = n;
        while(true){
            if(a<3){
                list.add(a); break;
            }
            list.add(a%3);
            a /= 3;
        }
        System.out.println(list.size());


        for(int b=0; b<list.size(); b++){
            answer += list.get(b) * Math.pow(3,list.size()-(b+1));
        }
        return answer;
    }
}
