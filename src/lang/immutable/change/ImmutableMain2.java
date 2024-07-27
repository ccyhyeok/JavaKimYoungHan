package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        // ImmutableObj obj2 = obj1.add(20);
        // 위와 같이 안적고(return값을 반환받지 않고) 아래와 같이 적으면 메모리 값(x002)을 버리는 것이기 떄문에
        // 아래 sout에 10이 보여짐    
        obj1.add(20);

        System.out.println("obj1: " + obj1.getValue());
    }
}
