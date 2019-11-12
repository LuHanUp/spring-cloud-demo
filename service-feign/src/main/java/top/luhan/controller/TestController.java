package top.luhan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.luhan.client.SchedualServiceHi;

/**
 * 〈TestController〉<br>
 *
 * @author luHan
 * @create 2019-11-12 14:24
 * @since 1.0.0
 */
@RestController
@RequestMapping("/feign")
public class TestController {
    @Autowired
    private SchedualServiceHi schedualServiceHi;
    @RequestMapping("/test")
    public String test(){
        return schedualServiceHi.useHello();
    }
}
