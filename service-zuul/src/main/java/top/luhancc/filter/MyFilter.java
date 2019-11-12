package top.luhancc.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈一句话功能简述〉<br>
 *
 * @author luHan
 * @create 2019-11-12 16:02
 * @since 1.0.0
 */
@Component
public class MyFilter extends ZuulFilter {
    /**
     * 参考FilterConstants
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * @return pre：路由之前
     *          routing：路由之时
     *          post： 路由之后
     *          error：发送错误调用
     */
    @Override
    public String filterType() {
        // 在路由之前进行过滤
        return "pre";
    }

    /**
     * @return 过滤的顺序
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否要过滤
     * @return true进行过滤 false 不进行过滤
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤的具体逻辑
      * @return
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            // TOKEN为空不进行放过
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.setResponseBody("TOKEN is empty");
            }catch (Exception e){
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
