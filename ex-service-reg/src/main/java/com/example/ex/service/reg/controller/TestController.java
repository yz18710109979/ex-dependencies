package com.example.ex.service.reg.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ex.commons.domain.TbUser;
import com.example.ex.commons.dto.AbstractBaseResult;
import com.example.ex.commons.dto.BaseResultFactory;
import com.google.common.collect.Lists;

@RestController
@RequestMapping(value = "test")
@SuppressWarnings("all")
public class TestController {

	 @Autowired
	    private ConfigurableApplicationContext applicationContext;

	    @GetMapping(value = "records/{id}")
	    public AbstractBaseResult getById(HttpServletRequest request, @PathVariable long id,HttpServletResponse response) {
	        TbUser tbUser = new TbUser();
	        tbUser.setId(1L);
	        tbUser.setUsername("和谷桐人");

	        if (id == 1) {
	            return BaseResultFactory.getInstance(response).build(request.getRequestURI(), tbUser);
	        } else {
	            return BaseResultFactory.build(HttpStatus.UNAUTHORIZED.value(), "参数类型错误", "ID 只能为 1", applicationContext.getEnvironment().getProperty("logging.level.com.funtl.myshop"));
	        }
	    }

	    @GetMapping(value = "records")
	    public AbstractBaseResult getList(HttpServletRequest request,HttpServletResponse response) {
	        TbUser tbUser1 = new TbUser();
	        tbUser1.setId(1L);
	        tbUser1.setUsername("和谷桐人");

	        TbUser tbUser2 = new TbUser();
	        tbUser2.setId(2L);
	        tbUser2.setUsername("亚丝娜");

	        List<TbUser> tbUsers = Lists.newArrayList();
	        tbUsers.add(tbUser1);
	        tbUsers.add(tbUser2);

	        return BaseResultFactory.getInstance(response).build(request.getRequestURI(), 2, 10, tbUsers);
	    }
}
