package top.luhancc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.luhancc.service.TestService;

/**
 * 〈TestController〉<br>
 *
 * @author luHan
 * @create 2019-11-11 19:17
 * @since 1.0.0
 */
@RestController
@RequestMapping("ribbon")
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/testRibbon")
    public String testRibbon(){
        return testService.testRibbon();
    }
}
