package com.example.ex.service.consumer.item.service.impl;

import org.springframework.stereotype.Service;

import com.example.ex.commons.domain.TbItem;
import com.example.ex.commons.mapper.TbItemMapper;
import com.example.ex.service.consumer.item.service.TbItemService;
import com.github.pagehelper.PageInfo;

@Service
public class TbItemServiceImpl extends BaseCrudServiceImpl<TbItem, TbItemMapper> implements TbItemService{

	@Override
	public PageInfo<TbItem> page(TbItem tbItem, int num, int size) {
		// TODO Auto-generated method stub
		return null;
	}
}
