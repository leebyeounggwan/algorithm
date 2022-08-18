package org.example.level1;

import java.util.ArrayList;
import java.util.Collections;

public class BusinessCard {

    public int solution(int[][] sizes) {
        int answer = 0;

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        for(int i=0; i<sizes.length; i++){
            a.add(sizes[i][0]);
            b.add(sizes[i][1]);
        }
        for(int i=0; i<a.size(); i++){
            if(a.get(i)<b.get(i)) {
                int temp = a.get(i);
                a.set(i,b.get(i));
                b.set(i,temp);
            }
        }
        Collections.sort(a);
        Collections.sort(b);

        answer = a.get(a.size()-1)*b.get(a.size()-1);


        return answer;
    }

}
