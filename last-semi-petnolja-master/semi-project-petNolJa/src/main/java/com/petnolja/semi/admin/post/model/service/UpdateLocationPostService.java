package com.petnolja.semi.admin.post.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.LocationPostDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class UpdateLocationPostService {

	private AdminPostDAO mapper;
	
	public int updateLocationPost(LocationPostDTO locationPostDTO) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminPostDAO.class);
		
		int result = mapper.updateLocationPost(locationPostDTO);
		System.out.println(result);
		
		if(result > 0) {
			sqlSession.commit();
		}else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}

}
