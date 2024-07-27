package lang.object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");

        // false
        // 참조 값이 다르기 때문
        System.out.println("identity = " + (user1 == user2));
        // false;
        // 같은 줄 알았는데 왜 false가 나오냐?
        // EqualsMainV2확인 ㄱㄱ
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
