package com.hnglng.giving.infrastructure.service;

import com.hnglng.giving.domain.model.User;
import com.hnglng.giving.domain.model.UserInfo;

import java.util.List;
import java.util.Set;



public interface UserService {

	User findUserby(String name);
	
	/**
	 * 根据账号Account查询当前用户
	 * @param account
	 * @return
	 */
	UserInfo findByAccount(String account);
	
	/**	
	 * 获取资源集合
	 * @param account
	 * @return
	 */
	Set<String> findPermissions(String account);
	
	/**
	 * 获取URL权限
	 * @param account
	 * @return
	 */
	List<String> findPermissionUrl(String account);
}
