/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku
* @author: fux
* @date: 2018年6月28日 下午2:59:44
*/

package com.artbanku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName: ZuulGateway_App
 * @Description: ZuulGateway_App
 * @author: fux
 * @date: 2018年6月28日 下午2:59:44
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulGateway_App {
	public static void main(String[] args) {
		SpringApplication.run(ZuulGateway_App.class, args);
	}
}
