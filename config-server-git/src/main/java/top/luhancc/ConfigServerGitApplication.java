package top.luhancc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 〈SpringCloud Config Server〉<br>
 *
 * @author luHan
 * @create 2019-11-12 16:51
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGitApplication.class,args);
    }
}
