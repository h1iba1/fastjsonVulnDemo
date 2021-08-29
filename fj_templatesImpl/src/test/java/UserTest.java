import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class UserTest {
    public static void main(String[] args) {
        User user=new User();
        user.setName("h11ba1");
        String result= JSON.toJSONString(user, SerializerFeature.WriteClassName);
        System.out.println(result);
    }
}
