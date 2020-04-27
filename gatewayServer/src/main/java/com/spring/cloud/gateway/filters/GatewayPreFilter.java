package com.spring.cloud.gateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;


// 백엔드 서버로 라우팅 되기 전에 수행되는 필터로 요청에 대한 인증, 로깅, 디버깅 등을 처리할 수 있음.
@Slf4j
public class GatewayPreFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
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
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("Using Pre Filter : " + request.getMethod() + "request to " + request.getRequestURL().toString());
        return null;
    }
}
