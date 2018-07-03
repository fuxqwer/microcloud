/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.service
* @author: fux
* @date: 2018年6月28日 下午3:29:46
*/

package com.artbanku.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.artbanku.entities.ProductInfo;

/**
 * @ClassName: ProductInfoClientService
 * @Description: 使用feign做降级处理
 * @author: fux
 * @date: 2018年6月28日 下午3:29:46
 */
@FeignClient(value = "MICROCLOUD-PRODUCT", fallbackFactory = ProductInfoClientServiceFallbackFactory.class)
public interface ProductInfoClientService {
	@GetMapping("/product/get/{id}")
	public ProductInfo getOne(@PathVariable("id") String uuid);

	@GetMapping("/product/list")
	public List<ProductInfo> list();
}
