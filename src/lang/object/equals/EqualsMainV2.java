package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        // false
        // 참조 값이 다르기 때문
        // identity: 동일성
        System.out.println("identity = " + (user1 == user2));
        // true;
        // 이유:
        // UserV2에 아래와 같이 메서드 오버라이딩 함.
        /*@Override
        public boolean equals(Object obj) {
            // obj.id: obj 타입엔 id가 없어서 아랫줄처럼 다운캐스팅 해줘야 됨.
            UserV2 user = (UserV2) obj;
            return id.equals(user.id);
        }*/
        // 기존 Object 타입의 equals()의 메서드는 아래임
        /*public boolean equals(Object obj) {
            return (this == obj);
        }*/
        // 즉, 결국엔 ==로 =등일성을 비교하는데,
        // 메서드를 재정의 함으로서 동등성이 true가 나오게 함.
        System.out.println("equality = " + (user1.equals(user2)));
        // 서로 다른 객체이지만 듈다 같은 id를 갖고 있다, 따라서 동등하다.
        // 추후 정확한 equals() 구현이 있음 이거는 그냥 참고용
    }
}
