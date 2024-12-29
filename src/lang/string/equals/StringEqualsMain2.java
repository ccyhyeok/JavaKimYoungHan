package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {

        // 개발자1 스타일
        String str1 = new String("hello");  // x001
        String str2 = new String("hello");  // x002
        System.out.println("메서드 호출 비교: " + isSame(str1, str2));

        // 개발자2 스타일
        String str3 = "hello";
        String str4 = "hello";
        System.out.println("메서드 호출 비교: " + isSame(str3, str4));
    }

    private static boolean isSame(String x, String y) {
        // 이거를 사용하면 안됨.
        // 이처럼 main 메서드를 만드는  개발자와 isSame() 메서드를 만다는 개발자마다 스타일이 다르기 때문에
        //return x==y; 를 쓰지말고 문자열에 대한 비교는 항상 equals()(동등성 비교)를 사용하자.
        return x.equals(y);

    }



}
