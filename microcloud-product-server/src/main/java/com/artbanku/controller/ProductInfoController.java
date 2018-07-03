/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.controller
* @author: fux
* @date: 2018年6月27日 下午5:51:20
*/

package com.artbanku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.artbanku.entities.ProductInfo;
import com.artbanku.service.ProductInfoService;

/**
 * @ClassName: ProductInfoController
 * @Description: ProductInfoController
 * @author: fux
 * @date: 2018年6月27日 下午5:51:20
 */
@RestController
public class ProductInfoController {
	@Autowired
	private ProductInfoService productInfoService;

	@GetMapping("/product/get/{id}")
	public ProductInfo getOne(@PathVariable("id") String uuid) {
		return productInfoService.findById(uuid);
	}

	@GetMapping("/product/list")
	public List<ProductInfo> list() {
		return productInfoService.list();
	}
}
