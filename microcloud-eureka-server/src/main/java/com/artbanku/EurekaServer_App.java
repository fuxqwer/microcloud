/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku
* @author: fux
* @date: 2018年6月27日 下午3:36:56
*/

package com.artbanku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName: EurekaServer_App
 * @Description: 服务发现启动类
 * @author: fux
 * @date: 2018年6月27日 下午3:36:56
 */
@SpringBootApplication
@EnableEurekaServer // 标识开启Eureka
public class EurekaServer_App {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer_App.class, args);
	}
}
