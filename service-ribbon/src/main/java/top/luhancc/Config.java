package top.luhancc;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 〈Config〉<br>
 *
 * @author luHan
 * @create 2019-11-11 19:15
 * @since 1.0.0
 */
@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
