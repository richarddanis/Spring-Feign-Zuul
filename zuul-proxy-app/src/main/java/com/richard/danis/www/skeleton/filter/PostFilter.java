package com.richard.danis.www.skeleton.filter;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

@Component
public class PostFilter extends APIFilter {

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletResponse response = ctx.getResponse();
        response.addHeader("X-Something", UUID.randomUUID().toString());
        LOGGER.info("Filter Type: {}, Response Status : {}", filterType(), response.getStatus());
        return null;
    }
}
