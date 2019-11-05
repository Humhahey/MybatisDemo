package cn.humhahey.proxy;

import cn.humhahey.service.HelloService;
import cn.humhahey.service.impl.HelloServiceImpl;
import lombok.extern.log4j.Log4j2;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Log4j2
public class HelloServiceCglib implements MethodInterceptor {
    private Object target;
    public Object getInstance(Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        log.info("inside intercept");
        return methodProxy.invokeSuper(o,objects);
    }

    public static void main(String[] args) {
        HelloService service = (HelloService)new HelloServiceCglib().getInstance(new HelloServiceImpl());
        service.sayHello("humhahey");
    }
}
