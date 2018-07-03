/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.service
* @author: fux
* @date: 2018年6月27日 下午5:46:14
*/

package com.artbanku.service;

import java.util.List;

import com.artbanku.entities.ProductInfo;

/**
 * @ClassName: ProductInfoService
 * @Description: ProductInfoService
 * @author: fux
 * @date: 2018年6月27日 下午5:46:14
 */

public interface ProductInfoService {

	public ProductInfo findById(String uuid);

	public List<ProductInfo> list();
}
