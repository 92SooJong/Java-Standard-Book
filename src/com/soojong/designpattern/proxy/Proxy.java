package com.soojong.designpattern.proxy;

public class Proxy implements ServiceInterface{

    private final ServiceInterface realService;

    public Proxy(ServiceInterface realService) {
        this.realService = realService;
    }

    @Override
    public void operation() {
        realService.operation();
    }

    public boolean checkAccess(){
        return true;
    }


}
