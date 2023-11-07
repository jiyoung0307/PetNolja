package com.petnolja.semi.admin.employee.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.WithdrawMemberDTO;
import com.petnolja.semi.admin.customer.model.dao.WithdrawMemberSelectDAO;

public class withdrawMemberSelectService {

    private WithdrawMemberSelectDAO withdrawMemberSelectDAO;
    
	public List<WithdrawMemberDTO> selectwithdrawMember() {
		
		SqlSession sqlSession = getSqlSession();
		withdrawMemberSelectDAO = sqlSession.getMapper(WithdrawMemberSelectDAO.class);
		
		List<WithdrawMemberDTO> withdrawMemList = withdrawMemberSelectDAO.selectwithdrawMember();
		
		sqlSession.close();
		
		return withdrawMemList;
	}
}	