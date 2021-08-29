

public class User {
    private String name;

//    public User() {
//        System.out.println("调用构造函数");
//    }

    public String getName() {
//        System.out.println("调用getName");
        return name;
    }

    public void setName(String name) {
//        System.out.println("调用setName");
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}