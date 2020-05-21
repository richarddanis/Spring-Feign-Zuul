package com.richard.danis.www.skeleton.filter;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class ErrorFilter extends APIFilter {

    @Override
    public String filterType() {
        return FilterConstants.ERROR_TYPE;
    }
}
