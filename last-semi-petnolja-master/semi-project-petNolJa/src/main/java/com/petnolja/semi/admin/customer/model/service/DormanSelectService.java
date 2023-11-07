package com.petnolja.semi.admin.customer.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.DormanMemberDTO;
import com.petnolja.semi.admin.customer.model.dao.DormanSelectDAO;

public class DormanSelectService {
	private DormanSelectDAO dormanSelectDAO;

	public List<DormanMemberDTO> selectDorman() {
		SqlSession sqlSession = getSqlSession();

		dormanSelectDAO = sqlSession.getMapper(DormanSelectDAO.class);
		
		List<DormanMemberDTO> dormanList = dormanSelectDAO.selectDorman();
		
		sqlSession.close();
		
		return dormanList;
	}

}
