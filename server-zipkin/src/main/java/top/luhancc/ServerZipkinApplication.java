package top.luhancc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * 〈Spring Cloud Sleuth〉<br>
 *
 * @author luHan
 * @create 2019-11-12 19:24
 * @since 1.0.0
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class,args);
    }
}
