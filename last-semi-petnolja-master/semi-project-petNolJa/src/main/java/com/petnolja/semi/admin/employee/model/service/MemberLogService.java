package com.petnolja.semi.admin.employee.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AdminLogDTO;
import com.petnolja.semi.admin.employee.model.dao.AdminDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

public class MemberLogService {
	
	private AdminDAO mapper;
	public List<AdminLogDTO> empLog(int empId) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AdminDAO.class);
		
		List<AdminLogDTO> adminLogList = mapper.empLog(empId);
		
		return adminLogList;
	}

}
