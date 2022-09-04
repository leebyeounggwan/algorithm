package org.example.level1;

public class Alphabet {

    public StringBuilder solution(String s, int n) {

        StringBuilder answer = new StringBuilder();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int check = 0;

            if(chars[i] == 32){  //공백 처리
                check = 32;
            } else {
                if (chars[i] < 91 && chars[i] > 64){  //대문자
                    check = chars[i]+n;
                    if (check>90) {
                        check = check - 26;
                    }
                } else if (chars[i] < 123 && chars[i] > 96) { //소문자
                    check = chars[i]+n;
                    if (check>122) {
                        check = check - 26;
                    }
                }
            }
            char c = (char)check;
            answer.append(c);
        }
        return answer;
    }
}
