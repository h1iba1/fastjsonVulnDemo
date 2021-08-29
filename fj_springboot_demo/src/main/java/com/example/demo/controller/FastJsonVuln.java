package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import org.springframework.web.bind.annotation.*;


@RestController
public class FastJsonVuln {

    @RequestMapping(value = "/fastjson",method = RequestMethod.POST)
    public void fj_poc_test(@RequestBody String data) throws Exception{

//        Object obj= JSON.parseObject(data,Object.class, Feature.SupportNonPublicField);
        JSON.parse(data).toString();

        System.out.println(data);
    }

    @RequestMapping(value = "/fjTemplatesImpl",method = RequestMethod.POST)
    public void fj_templatesImpl_test(@RequestBody String data) throws Exception{
        JSON.parse(data);
//        Object obj= JSON.parseObject(data,Object.class, Feature.SupportNonPublicField);

//        Object obj=JSON.parseObject(data,Object.class);
//        Object obj=JSON.parse(data);
        System.out.println(data);
    }


    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
