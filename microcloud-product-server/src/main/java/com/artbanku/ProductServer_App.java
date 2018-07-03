/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku
* @author: fux
* @date: 2018年6月28日 上午11:14:34
*/

package com.artbanku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ProductServer_App
 * @Description: ProductServer_App
 * @author: fux
 * @date: 2018年6月28日 上午11:14:34
 */
@SpringBootApplication
@EnableEurekaClient
public class ProductServer_App {
	public static void main(String[] args) {
		SpringApplication.run(ProductServer_App.class, args);
	}
}
