import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

public class ParseObjectParseCompared {
    public static void main(String[] args) {
        String jsons="{\"@type\":\"User\",\"name\":\"Kpli0rn\"}";
        Object user= JSON.parseObject(jsons,User.class,Feature.SupportNonPublicField);
        Object user1=JSON.parse(jsons);
        System.out.println("parseObject:"+user);
        System.out.println("parse:"+user1.getClass().getName());
    }
}
