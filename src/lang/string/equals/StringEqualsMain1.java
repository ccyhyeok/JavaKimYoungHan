package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        // 동일성(Identity): == 연산자를 사용해서 두 객체의 참조가 동일한 객체를 가리키고 있는지 확인
        String str1 = new String("hello");  // x001
        // 동등성(Equality): equals() 메서드를 사용하여 두 객체가 논리적으로 같은지 확인
        String str2 = new String("hello");  // x002
        // str1, str2는 new String()을 사용해서 각각 인스턴스를 생성함.
        // 서로 다른 인스턴스이므로 동일성(==) 비교에 실패한다.  (참조 값이 다름.)
        // str1, str2는 내부에 같은 "hello"를 갖고 있기 때문에 논리적으로 같음.(사람이 봤을 때 같아 보임)
        // FYI) String 클래스는 내부 문자열 값을 비교하도록 equals() 메서드를 재정의 해두었다.
        System.out.println("new String == 비교: " + (str1 == str2)); // false
        System.out.println("new String equals 비교: " + (str1.equals(str2))); // true

        String str3 = "hello";
        String str4 = "hello";
        // Java는 메모리 효율성과 성능 최적화를 위해 문자열 풀을 사용함.
        // Java 실행되는 시점에 클래스에 문자열 리터럴이 있으면 문자열 풀에 String 인스턴스를 미리 만들어둔다.
        // (같은 문자열이 있으면 만들지 않는다.)
        // String str3 = "hello";와 같이 문자열 리터럴을 사용하면 문자열 풀에서 "hello"라는 문자를 가진 String 인스턴스를 찾고
        // 찾은 인스턴스의 참조(x003)을 반환한다.
        // String str4 = "hello"의 경우 "hello" 문자열 리터럴을 사용하므로 문자열 풀에서 str3과 같은 x003 참조를 사용한다.
        // 문자열 풀 덕분에 같은 문자를 사용하는 경우 메모리 사용을 줄이고 문자를 만드는 식나도 줄어들기 떄문에 성능도 최적화 할 수 있다.
        // 따라서 str3, str4가 같은 문자열 참조를 바라보고 있으므로 동일성 비교에 성공한다.
        System.out.println("리터럴 == 비교: " + (str3 == str4)); // true -> 이것이 왜 true가 나올까?
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4))); // true
    }

}
