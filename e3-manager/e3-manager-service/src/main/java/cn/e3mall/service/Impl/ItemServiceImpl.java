package cn.e3mall.service.Impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
//商品管理服务

	@Autowired
	private TbItemMapper itemMapper; 
	
	@Override
	public TbItem getItemById(long itemId) {
		TbItem item = itemMapper.selectByPrimaryKey(itemId);
		return item;
	}

}
