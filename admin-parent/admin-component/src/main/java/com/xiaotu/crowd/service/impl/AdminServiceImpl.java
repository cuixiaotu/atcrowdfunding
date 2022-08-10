package com.xiaotu.crowd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaotu.crowd.entity.Admin;
import com.xiaotu.crowd.entity.AdminExample;
import com.xiaotu.crowd.mapper.AdminMapper;
import com.xiaotu.crowd.service.api.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminMapper adminMapper;

	@Override
	public void saveAdmin(Admin admin) {
		
		adminMapper.insert(admin);
		
		throw new RuntimeException();
		
	}

	@Override
	public List<Admin> getAll() {
		return adminMapper.selectByExample(new AdminExample());
	}

}
