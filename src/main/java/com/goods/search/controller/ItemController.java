package com.goods.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goods.common.utils.GoodsResult;
import com.goods.search.service.ItemService;

/**
 * 索引库维护
 * 
 * @author dell
 *
 */
@Controller
@RequestMapping("manager")
public class ItemController {

	@Autowired
	private ItemService itemService;

	// 导入商品数据到索引库
	@RequestMapping("importAll")
	@ResponseBody
	public GoodsResult importAllItems() {
		GoodsResult result = itemService.importAllItems();
		return result;
	}
}
