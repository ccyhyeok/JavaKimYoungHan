package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        // int, double, boolean -> primitive 타입 (기본형)
        String str1 = "hello"; // 객체, 클래스 즉 참조형
        String str2 = new String("hello"); // 객체로 생성할 수 있다.

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // 문자열(literal)은 매우 자주 사용되므로, Java언어에서 편의상 쌍따옴표로 문자열을 감싸면
        // new String("hello");과 같이 변경해줌.
     }
}
