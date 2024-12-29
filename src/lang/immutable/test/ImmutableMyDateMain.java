package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        // date1 = x001, date2 = x001
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        // date1.setYear(2025);
        // 방법1 (이것보다는 방법2 사용하기)
        //date1 = new ImmutableMyDate(2025, 1, 1);
        // 방법2
        date1 = date1.withYear(2025); // x002를 반환함
        // 만약 아래와 같이 돌릴 경우 반환값(return)을 받지 않기 때문에 date1은 2024-1-1로 나옴
        // 불변객체에서 값을 변경하는 메서드가 있으면 반환값을 받아서 참조를 가져가야 값이 변경된것을 사용할 수 있음.
        // 반환 안받으면 값이 버려지는 것과 마찬가지임.
        //date1.withYear(2025);
        System.out.println("date1 = " + date1); // x002 (2025-1-1)
        System.out.println("date2 = " + date2); // x001 (2024-1-1)

    }
}
