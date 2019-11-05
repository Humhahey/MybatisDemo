package cn.humhahey.proxy;

import cn.humhahey.service.HelloService;
import cn.humhahey.service.impl.HelloServiceImpl;
import lombok.extern.log4j.Log4j2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Log4j2
public class HelloServiceProxy implements InvocationHandler {
    private Object target;

    public Object bind(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("inside invoke");
        return method.invoke(target, args);
    }

    public static void main(String[] args) {
        HelloService service = (HelloService)new HelloServiceProxy().bind(new HelloServiceImpl());
        service.self("humhahey");
    }
}
