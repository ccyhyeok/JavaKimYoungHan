package lang.immutable.address;

public class ImmutableAddress {

    // ImmutableAddress는 한번 값을 생성자에서 생성하고나면 바꾸는게 불가하다.
    // 그러므로 setValue에서 에러 발생한다.
    // 중요 포인트: 생성자를 통해서만 값을 설정할 수 있고 이후에는 값을 변경하는게 불가함
    private final String value;

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

//    public void setValue(String value) {
//        this.value = value;
//    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
