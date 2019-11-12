package top.luhancc.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈TestService〉<br>
 *
 * @author luHan
 * @create 2019-11-11 19:16
 * @since 1.0.0
 */
@Service
public class TestService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "testRibbonFallBack")
    public String testRibbon() {
        return restTemplate.getForObject("http://service-api/api/hi", String.class);
    }

    public String testRibbonFallBack() {
        return "请稍后再试";
    }
}
