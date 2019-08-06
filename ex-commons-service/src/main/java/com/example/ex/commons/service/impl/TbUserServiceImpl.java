package com.example.ex.commons.service.impl;

import org.springframework.stereotype.Service;

import com.example.ex.commons.domain.TbUser;
import com.example.ex.commons.mapper.TbUserMapper;
import com.example.ex.commons.service.TbUserService;

@Service
public class TbUserServiceImpl extends BaseCrudServiceImpl<TbUser, TbUserMapper> implements TbUserService{

}
