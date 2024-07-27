package lang.object;

// 부모가 없으면 묵시적으로 object 클래스를 상속받는다.
// 묵시적으로 말하지 않아도 알아서
public class Parent {
    // public Class Parent extends Object랑 같은 의미임.

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
