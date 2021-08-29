import com.alibaba.fastjson.JSON;

public class Parse_test {

    public static void main(String[] args) {
        String json="{\"@type\":\"User\",\"name\":\"h11ba1\"}";
        Object parseObject =JSON.parseObject(json,Object.class);
        Object parse= JSON.parse(json);

        System.out.println(parseObject.getClass().getName());
        System.out.println(parse.getClass().getName());

    }

}
