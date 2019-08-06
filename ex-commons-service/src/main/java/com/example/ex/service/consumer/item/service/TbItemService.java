package com.example.ex.service.consumer.item.service;

import com.example.ex.commons.domain.TbItem;
import com.github.pagehelper.PageInfo;

public interface TbItemService extends BaseCrudService<TbItem>{

	PageInfo<TbItem> page(TbItem tbItem, int num, int size);
}
