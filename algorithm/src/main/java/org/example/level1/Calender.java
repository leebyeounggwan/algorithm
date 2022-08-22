package org.example.level1;

public class Calender {
    public String solution(int a, int b) {
        String answer = "";
        String[] week = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] monthDay = {31,29,31,30,31,30,31,31,30,31,30,31};

        int dayPlus = 0;
        for(int i=1;i<a;i++){
            dayPlus += monthDay[i-1];
            //System.out.println(dayPlus);
        }
        dayPlus += b-1;
        //System.out.println(dayPlus);
        answer = week[(dayPlus+5)%7];
        //System.out.print(week);
        return answer;
    }
}
