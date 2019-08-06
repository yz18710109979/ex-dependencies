package com.example.ex.service.provider.item.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex.commons.domain.TbItem;
import com.example.ex.commons.service.TbItemService;
import com.example.ex.commons.web.AbstractBaseController;
import com.github.pagehelper.PageInfo;
@RestController
@RequestMapping(value = "item")
public class TbItemController extends AbstractBaseController<TbItem>  {

	@Autowired
    private TbItemService tbItemService;

//    @ApiOperation(value = "商品分页查询")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "num", value = "页码", required = true, paramType = "path", dataType = "int"),
//            @ApiImplicitParam(name = "size", value = "笔数", required = true, paramType = "path", dataType = "int")
//    })
    @GetMapping(value = "page/{num}/{size}")
    public PageInfo<TbItem> page(
            @PathVariable int num,
            @PathVariable int size
    ) {
        PageInfo<TbItem> page = tbItemService.page(null, num, size);
        return page;
    }
}
