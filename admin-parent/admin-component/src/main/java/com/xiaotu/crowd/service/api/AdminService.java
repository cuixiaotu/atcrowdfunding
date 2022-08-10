package com.xiaotu.crowd.service.api;

import java.util.List;

import com.xiaotu.crowd.entity.Admin;

public interface AdminService {
	
	void saveAdmin(Admin admin);

	List<Admin> getAll();

}
