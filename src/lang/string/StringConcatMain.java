package lang.string;

public class StringConcatMain {

    // String은 클래스다. 따라서 참조형임(기본형 X)
    // 참조형은 변수에 계산할 수 있는 값이 들어있는 것이 아닌,
    // x001과 같이 계산할 수 없는 참조값이 들어있다.
    // 따라서 원칙적으로 + 같은 연산을 사용할 수 없다.
    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java"; // x002

        String result1 = a.concat(b);
        String result2 = a + b;
        //주석과 같이 참조값이 들어가 있음.
        // 바래 아래 가능함.
        //String result1 = x001.concat(x002);
        // 참조 값끼리 원래 +는 안됨.
        //String result2 = x001 + x002;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // Java에서 문자열을 더할 때는 String이 제공하는 concat()과 같은 메서드를 사용해야 한다.
        // 하지만 문자열은 너무 자주 다뤄지기 때문에 자바 언어에서 특별히 +연산을 제공함.

    }
}
