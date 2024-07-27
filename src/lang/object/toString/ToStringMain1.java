package lang.object.toString;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        //toString() 반환값 출력
        System.out.println(string);

        //object 직접 출력
        System.out.println(object);

        // 위 두개의 출력 값이 같다 왜?
        // prlntln 파고 들어가면 toString 해주는 것이 있어서 그럼
    }
}
