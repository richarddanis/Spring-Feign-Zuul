package com.richard.danis.www.skeleton.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class RouteFilter extends APIFilter {

    @Override
    public String filterType() {
        return FilterConstants.ROUTE_TYPE;
    }
}
