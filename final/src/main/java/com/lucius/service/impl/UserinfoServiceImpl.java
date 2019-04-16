package com.lucius.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lucius.entity.Userinfo;
import com.lucius.mapper.UserinfoMapper;
import com.lucius.service.IUserinfoService;
@Service
public class UserinfoServiceImpl implements IUserinfoService {
	@Resource
	UserinfoMapper userinfoMapper;
	@Override
	public Userinfo login(Userinfo userinfo) {
		return userinfoMapper.login(userinfo);
	}

}
