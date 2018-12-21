package wechat.api.mp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jokin
 * @date 2018/12/21 17:35
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
