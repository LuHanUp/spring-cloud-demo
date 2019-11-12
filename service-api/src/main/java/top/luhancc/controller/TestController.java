package top.luhancc.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈TestController〉<br>
 *
 * @author luHan
 * @create 2019-11-11 19:06
 * @since 1.0.0
 */
@RestController
public class TestController {
    @GetMapping("/api/hi")
    @HystrixCommand(commandKey = "api/hi/hello")
    public String hello(){
        return "hello";
    }
}
