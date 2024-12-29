package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    // final이라 setter 못만듬.

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        // 방법1
        return new ImmutableObj(result);
        // 방법 1-1
        //return new ImmutableObj(value + addValue);
        // 방법2
        //ImmutableObj immutableObj = new ImmutableObj(result);
        //return immutableObj;
        // 아래는 cannot assign a value to a final variable value란 에러 뜸.
        // value = value + addValue;
    }

    public int getValue() {
        return value;
    }
}
