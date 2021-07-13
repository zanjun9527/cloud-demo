package com.xiaoyuer.cld.apigateway;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * created by xiaoyuer
 */
@Service
public class ZuulServiceImpl extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String name = request.getParameter("name");

        if(name==null || !name.equals("ckck")){
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(404);
//            currentContext.setResponseBody("zenmeshuoa laotie");
            return  null;
        }
        return null;
    }
}
