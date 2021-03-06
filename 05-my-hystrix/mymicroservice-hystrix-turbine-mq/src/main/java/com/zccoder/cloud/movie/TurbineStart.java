package com.zccoder.cloud.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

/**
 * @title 启动类
 * @describe 使用消息中间件收集数据
 * @author zc
 * @version 1.0 2017-12-07
 */
@EnableTurbineStream
@SpringBootApplication
public class TurbineStart extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TurbineStart.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TurbineStart.class);
	}
}