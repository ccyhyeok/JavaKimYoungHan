package lang.string;

public class CharArrayMain {

    public static void main(String[] args) {
        // char 문자 하나를 다룰 때 사용함.
        char a = '가';
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr); // hello
        
        String str = "hello";
        System.out.println("str = " + str); // hello
    }
}
