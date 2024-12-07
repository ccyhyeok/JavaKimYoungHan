package lang.programmers;

import java.util.Arrays;

public class Lessons42577 {

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            // phoneBook[i]인 것하고 i+1인 거를 비교하기
            String currItem = phone_book[i];

            for (int j = i+1; j < phone_book.length; j++) {
                String nextItem = phone_book[j];
                if (nextItem.startsWith(currItem)) {
                    return false;
                }

            }


            System.out.println(phone_book[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = new String[]{"119", "97674223", "1195524421"};
        System.out.println(phone_book.length);

        System.out.println(solution(phone_book));
    }

}
