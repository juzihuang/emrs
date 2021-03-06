package com.common.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ibatis.sqlmap.client.SqlMapClient;

@SuppressWarnings("deprecation")
public class BaseDao extends SqlMapClientDaoSupport {
	@Autowired
	public void setSqlMapClientBase(SqlMapClient sqlMapClient){
		super.setSqlMapClient(sqlMapClient);
	}
}
