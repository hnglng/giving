package com.hnglng.giving.infrastructure.service;

import com.hnglng.giving.domain.model.ModuleInfo;

import java.util.List;



public interface ModuleService {
	/**
	 * 获取角色模块
	 * @param userId
	 * @return
	 */
	List<ModuleInfo> findModuleByUserId(int userId);
}
