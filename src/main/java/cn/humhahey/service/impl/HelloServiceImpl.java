package cn.humhahey.service.impl;

import cn.humhahey.service.HelloService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHellod(String name) {
        log.info("Hello "+name);
    }
}
