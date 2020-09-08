package com.chance.dubbo.provider.service.impl;

import com.chance.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>
 *
 * <p>
 *
 * @author chance
 * @since 2020-09-07
 */
@DubboService(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + ", I'am provider!";
    }
}
