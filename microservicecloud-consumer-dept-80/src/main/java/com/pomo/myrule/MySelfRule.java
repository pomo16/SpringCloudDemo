package com.pomo.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {
	
	@Bean
	public IRule myRule() {
		return new RandomRule(); //默认轮询，自定义为随机
	}
}
