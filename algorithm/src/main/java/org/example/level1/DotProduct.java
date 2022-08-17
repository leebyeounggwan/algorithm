package org.example.level1;

import java.util.Arrays;

public class DotProduct {

    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        int[] c = new int[a.length];
        for(int i=0; i<a.length; i++){
            c[i] = a[i]*b[i];
        }
        answer = Arrays.stream(c).sum();
        return answer;
    }

    public static void main(String[] args) {
        DotProduct sol = new DotProduct();

        int[] numbers1 = {1,2,3,4};
        int[] numbers2 = {-3,-1,0,2};

        int result1 = sol.solution(numbers1, numbers2);

        System.out.println(result1);
    }
}
