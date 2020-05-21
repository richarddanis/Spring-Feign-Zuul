package com.richard.danis.www.skeleton.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public abstract class APIFilter extends ZuulFilter {

    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Override
    public String filterType() {
        return "none";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        LOGGER.info("Filter Type: {}, Request Method : {}, Request URL: {}", filterType(), request.getMethod(), request.getRequestURL().toString());
        return null;
    }
}
