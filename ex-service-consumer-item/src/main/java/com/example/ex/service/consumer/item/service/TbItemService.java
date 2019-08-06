package com.example.ex.service.consumer.item.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "ex-service-provider-item")
public interface TbItemService {
	@GetMapping(value = "/item/page/{num}/{size}")
    String page(@PathVariable(name = "num") int pageNum, @PathVariable(name = "size") int pageSize);
}
