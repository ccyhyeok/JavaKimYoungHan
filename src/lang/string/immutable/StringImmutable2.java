package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        // String은 불변객체이다.
        // 따라서 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환한다.
        // concat 메서드 확인해보면 String 반환값이 있음
        // 그러므로 아래와 같이 되어 있으면 [Result of 'String.concat()' is ignored ]라고 표기됨.
        // str.concat(" java");
        String str2 = str1.concat(" java");

        System.out.println("str1 = " + str1); // str = hello
        System.out.println("str2 = " + str2); // str = hello

        // ** 중요 **
        // String이 불변으로 설계된 이유는 String 인스턴스 값이 중간에 변경되면
        // 같은 문자열을 참고하는 다른 변수의 값도 함께 변경된다.
        // String은 자바 내부에서 문자열 풀을 통해 최적화를 한다.
        // 만약 String 내부의 값을 변경할 수 있다면, 기존에 문자열 풀에서 같은 문자를 참조하는 변수의 모든 문자가 함께 변경되어 버리는 문제가 발생한다.
        // 다음의 경우 str3이 참조하는 문자를 변경하면 str4의 문자도 함께 변경되는 사이드 이페트 문제가 발생한다.
        // String str3 = "hello";
        // String str4 = "hello";
        // String 클래스는 불변으로 설계되어서 이런 사이드 이펙트 문제가 발생하지 않는다.
    }

}
