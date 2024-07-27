package lang.object.toString;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        // 포인트
        // Dog 클래스 내 @Override를 사용한 toString() 메서드를 사용하면
        // 2. println 내부에서 toString 호출
        // lang.object.toString.Car@4e50df2e
        // Dog{dogName='멍멍이1', age=2}
        // Dog{dogName='멍멍이2', age=5}
        // 아래와 같은 형식으로 해당 클래스의 필드명 등 정보를 보여줌

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // toString()을 Override해서 참조값을 알 수가 없을 때 확인할 수 있는 방법
        // Dog{dogName='멍멍이1', age=2} -> lang.object.Dog.Car@4e50df2e
        // 으로 보여지도록 하는 방법
        int i = System.identityHashCode(dog1);
        System.out.println("i = " + i);
        int j = System.identityHashCode(dog2);
        System.out.println("j = " + j);

        // 간편하게 보기 위해서 16진수로 바꾼다.
        //refValue: 30dae81
        String refValue = Integer.toHexString(i);
        System.out.println("refValue: " + refValue);
        //refValue2: cc34f4d
        String refValue2 = Integer.toHexString(j);
        System.out.println("refValue2: " + refValue2);





    }
}
