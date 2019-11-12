package top.luhan.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈使用Feign调用service-api服务〉<br>
 *
 * @author luHan
 * @create 2019-11-12 14:21
 * @since 1.0.0
 */
@FeignClient(value = "service-api")
public interface SchedualServiceHi {
    @RequestMapping("/api/hi")
    public String useHello();
}
