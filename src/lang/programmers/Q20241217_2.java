package lang.programmers;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Q20241217_2 {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
             if (n % i == 0) {
                 answer = answer+i;
                 System.out.println("i = " + i);
                 System.out.println("answer = " + answer);
             }
        }

        return answer;
    }
}
