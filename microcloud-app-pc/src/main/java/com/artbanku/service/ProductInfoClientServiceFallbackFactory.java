/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.service
* @author: fux
* @date: 2018年6月28日 下午3:35:11
*/

package com.artbanku.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.artbanku.entities.ProductInfo;

import feign.hystrix.FallbackFactory;

/**
 * @ClassName: ProductInfoClientServiceFallbackFactory
 * @Description: FallbackFactory
 * @author: fux
 * @date: 2018年6月28日 下午3:35:11
 */
@Component
public class ProductInfoClientServiceFallbackFactory implements FallbackFactory<ProductInfoClientService> {

	@Override
	public ProductInfoClientService create(Throwable arg0) {
		return new ProductInfoClientService() {

			@Override
			public List<ProductInfo> list() {
				return null;
			}

			@Override
			public ProductInfo getOne(String uuid) {
				return new ProductInfo().setProduct_name("无此用户").setProduct_uuid(uuid);
			}
		};
	}

}
