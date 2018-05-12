package com.ty.starter;

/**
 * Created by Administrator on 2018/5/12.
 */
public class HelloService {
    HelloProperties helloProperties;
    public String sayHello(String name){
       return helloProperties.getPrefix()+"-"+name+"-"+helloProperties.getSuffix();
    }

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
}
