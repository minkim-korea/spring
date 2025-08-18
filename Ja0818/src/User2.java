public class User2 implements IUser {
    private int no = 2; // 초기값 설정

    private String id;
    private String pw;
    private String name;

    // 생성자
    public User2() {}

    public User2(String id, String pw, String name) {
        this.id = id;
        this.pw = pw;
        this.name = name;
    }

    // IUser 인터페이스의 getNo() 메서드를 구현합니다.
    @Override
    public int getNo() {
        return no;
    }

    // 나머지 getter/setter 메서드는 그대로 둡니다.
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}