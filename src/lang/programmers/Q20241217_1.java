package lang.programmers;

public class Q20241217_1 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        solution(num1, num2);

    }

    public static int solution(int num1, int num2) {
        int answer = 0;
        if (num1 == num2) {
            answer = 1;
        }
        else {
            answer = -1;
        }

        return answer;
    }



}
