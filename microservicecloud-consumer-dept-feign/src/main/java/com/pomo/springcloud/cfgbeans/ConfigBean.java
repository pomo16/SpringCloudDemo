package com.pomo.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端负载均衡的工具
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myRule(){
//		return new RandomRule(); //显示声明配置，使用随机算法替代默认的轮询算法
//	}
}
