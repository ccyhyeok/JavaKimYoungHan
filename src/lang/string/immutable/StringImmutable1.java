package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str); // str = hello
        // 왜 위와같이 나올까 String은 final byte[]로 되어 있는 불변객체이기 때문일듯
        // StringImmutable2 확인하장
    }

}
