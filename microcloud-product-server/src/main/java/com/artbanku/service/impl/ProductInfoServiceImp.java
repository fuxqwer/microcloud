/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.service.impl
* @author: fux
* @date: 2018年6月27日 下午5:48:25
*/

package com.artbanku.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artbanku.dao.ProductInfoDao;
import com.artbanku.entities.ProductInfo;
import com.artbanku.service.ProductInfoService;

/**
 * @ClassName: ProductInfoServiceImp
 * @Description: ProductInfoServiceImp
 * @author: fux
 * @date: 2018年6月27日 下午5:48:25
 */
@Service
public class ProductInfoServiceImp implements ProductInfoService {

	@Autowired
	private ProductInfoDao dao;

	/*
	 * (non Javadoc)
	 * 
	 * @Title: findById
	 * 
	 * @Description: 通过uuid查询一个商品信息
	 * 
	 * @param uuid
	 * 
	 * @return
	 * 
	 * @see com.artbanku.service.ProductInfoService#findById(java.lang.String)
	 */

	@Override
	public ProductInfo findById(String uuid) {
		return dao.findByUuid(uuid);
	}

	/*
	 * (non Javadoc)
	 * 
	 * @Title: list
	 * 
	 * @Description: 查询所有商品信息列表
	 * 
	 * @return
	 * 
	 * @see com.artbanku.service.ProductInfoService#list()
	 */

	@Override
	public List<ProductInfo> list() {
		return dao.findAll();
	}

}
