package top.luhancc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈TestController〉<br>
 *
 * @author luHan
 * @create 2019-11-12 17:43
 * @since 1.0.0
 */
@RestController
@RequestMapping("/config-client-git")
public class TestController {
    @Value("${message}")
    private String message;

    @RequestMapping("/getMessage")
    public String getMessage(){
        return message;
    }
}
