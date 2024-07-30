package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";
        
        String result1 = a.concat(b);
        String result2 = a + b;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        // 원칙적으로 참조값(메모리 x001이라고 생각하기)끼리 +는 안되고 concat()이라는 기능을 사용해야 되나
        // 자바에서 특별히 해준다..~

    }
}
