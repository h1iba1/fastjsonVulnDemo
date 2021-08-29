import java.io.IOException;

public class Object {
    public Object() {
    }
    static {
        try {
            // win用户改成calc即可
            Runtime.getRuntime().exec("open -a Calculator");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
