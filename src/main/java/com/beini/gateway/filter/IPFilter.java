package com.beini.gateway.filter;

import com.netflix.zuul.ZuulFilter;
/**
 * IP过滤器
 * @author lb_chen
 *
 */
//@Component
public class IPFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public Object run() {
		return null;
	}

	@Override
	public String filterType() {
		return null;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

}
