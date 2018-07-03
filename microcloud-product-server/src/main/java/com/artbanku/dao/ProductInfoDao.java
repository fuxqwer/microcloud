/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.dao
* @author: fux
* @date: 2018年6月27日 下午5:36:14
*/

package com.artbanku.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.artbanku.entities.ProductInfo;

/**
 * @ClassName: ProductInfoDao
 * @Description: ProductInfoDao
 * @author: fux
 * @date: 2018年6月27日 下午5:36:14
 */
@Mapper
public interface ProductInfoDao {
	public ProductInfo findByUuid(String uuid);
	
	public List<ProductInfo> findAll();
}
