package com.example.ex.service.reg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "reg")
public class RegController {

	/**
	 * 根据 ID 测试查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(value = { "{id}" })
	public String reg(@PathVariable long id) {
		return "success";
	}
}
