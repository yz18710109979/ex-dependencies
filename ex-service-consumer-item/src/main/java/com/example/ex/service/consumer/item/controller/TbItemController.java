package com.example.ex.service.consumer.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex.commons.domain.TbItem;
import com.example.ex.commons.dto.AbstractBaseResult;
import com.example.ex.commons.utils.MapperUtils;
import com.example.ex.commons.web.AbstractBaseController;
import com.example.ex.service.consumer.item.service.TbItemService;
import com.fasterxml.jackson.databind.JavaType;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping(value = "item")
public class TbItemController extends AbstractBaseController<TbItem>{

	@Autowired
    private TbItemService tbItemService;

//    @ApiOperation(value = "商品分页查询")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "num", value = "页码", required = true, paramType = "path", dataType = "int"),
//            @ApiImplicitParam(name = "size", value = "笔数", required = true, paramType = "path", dataType = "int")
//    })
    @GetMapping(value = "page/{num}/{size}")
    public AbstractBaseResult page(@PathVariable int num, @PathVariable  int size) {
        String json = tbItemService.page(num, size);
        try {
            JavaType javaType = MapperUtils.getCollectionType(PageInfo.class, TbItem.class);
            PageInfo<TbItem> pageInfo = MapperUtils.getInstance().readValue(json, javaType);
            return success(request.getRequestURI(), pageInfo.getNextPage(), pageInfo.getPages(), pageInfo.getList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
