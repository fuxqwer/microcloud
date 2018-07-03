/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku
* @author: fux
* @date: 2018年6月28日 下午3:41:28
*/

package com.artbanku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName: Pc_App
 * @Description: 启动类
 * @author: fux
 * @date: 2018年6月28日 下午3:41:28
 */
@SpringBootApplication
@EnableEurekaClient // 开启eureka客户端，从eureka中获取相关服务
@EnableFeignClients(basePackages = { "com.artbanku" })
@ComponentScan("com.artbanku")
public class Pc_App {
	public static void main(String[] args) {
		SpringApplication.run(Pc_App.class, args);
	}
}
