package top.luhancc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈Config Client Git〉<br>
 *
 * @author luHan
 * @create 2019-11-12 17:37
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientGitApplication.class,args);
    }
}
