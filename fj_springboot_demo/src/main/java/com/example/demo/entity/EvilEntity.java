package com.example.demo.entity;

public class EvilEntity {
    String cmd;

    public EvilEntity(){

    }

    public void setCmd(String cmd) throws Exception{
        this.cmd = cmd;
        Runtime.getRuntime().exec(this.cmd);
    }

    public String getCmd(){
        return this.cmd;
    }

    @Override
    public String toString() {
        return "Evil{" +
                "cmd='" + cmd + '\'' +
                '}';
    }
}
