package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        // obj.id: obj 타입엔 id가 없어서 아랫줄처럼 다운캐스팅 해줘야 됨.
        UserV2 user = (UserV2) obj;
        return id.equals(user.id);
    }
    */

    // 정확한 equals 구현하는 방법
    // 외워서 하지는 못함..
    // alt + insert해서 generate -> equals and hashcode 선택하면 됨
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
