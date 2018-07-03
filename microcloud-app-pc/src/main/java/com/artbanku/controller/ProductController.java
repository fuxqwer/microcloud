/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.controller
* @author: fux
* @date: 2018年6月28日 下午3:39:19
*/

package com.artbanku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.artbanku.entities.ProductInfo;
import com.artbanku.service.ProductInfoClientService;

/**
 * @ClassName: ProductController
 * @Description: ProductController
 * @author: fux
 * @date: 2018年6月28日 下午3:39:19
 */
@Controller
public class ProductController {

	@Autowired
	private ProductInfoClientService productInfoClientService;

	@GetMapping("/product/get/{id}")
	@ResponseBody
	public ProductInfo getOne(@PathVariable("id") String uuid) {
		return productInfoClientService.getOne(uuid);
	};

	@GetMapping("/product/list")
	@ResponseBody
	public List<ProductInfo> list() {
		return productInfoClientService.list();
	}
}
