package com.tuacy.actuator.indicator;

import java.util.Map;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/***
 * 环境配置检查,系统环境变量，通过实现 HealthIndicator 实现出来
 * @author Administrator
 */
@Component("enviromentData")
public class EnviromentHealthIndicator implements HealthIndicator  {
     
	@Override
	public Health health() {
	    Map<String,String> map=System.getenv();
		return Health.up().withDetail("data",map).build();
	}

}
