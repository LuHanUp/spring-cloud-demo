package top.luhancc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 〈服务监控〉<br>
 *
 * @author luHan
 * @create 2019-11-12 11:07
 * @since 1.0.0
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ServiceMonitoringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceMonitoringApplication.class,args);
    }
}
