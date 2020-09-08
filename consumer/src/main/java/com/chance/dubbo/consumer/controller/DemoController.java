package com.chance.dubbo.consumer.controller;

import com.chance.dubbo.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * <p>
 *
 * @author chance
 * @since 2020-09-07
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @DubboReference(version = "${demo.service.version}", check = false, timeout = 55000)
    private DemoService demoService;

    @GetMapping("/say/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return demoService.sayHello(name);
    }
}
