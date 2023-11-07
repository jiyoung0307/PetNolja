package com.petnolja.semi.common.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.petnolja.semi.common.config.ConfigLocation;
import com.petnolja.semi.member.regist.model.dao.MemberDAO;

public class Template {
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSession getSqlSession() {
		
		if(sqlSessionFactory == null) {
			String resource = ConfigLocation.mybatisConfigLocation;
			
			try {
				InputStream inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sqlSessionFactory.openSession(false);
	}
}
