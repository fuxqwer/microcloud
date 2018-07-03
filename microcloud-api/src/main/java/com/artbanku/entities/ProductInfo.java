/**
* Copyright © 2018 fux. All rights reserved.
*
* @Package: com.artbanku.entities
* @author: fux
* @date: 2018年6月27日 下午3:22:38
*/

package com.artbanku.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @ClassName: ProductInfo
 * @Description: 商品信息实体类,这里对应着艺术品详情
 * @author: fux
 * @date: 2018年6月27日 下午3:22:38
 */

@NoArgsConstructor // 无参构造
@Data // get&set
@Accessors(chain = true) // 方便链式调用
public class ProductInfo {
	private Long product_id; // id
	private String product_uuid; // 商品唯一编码
	private String product_name;// 商品名称

}
