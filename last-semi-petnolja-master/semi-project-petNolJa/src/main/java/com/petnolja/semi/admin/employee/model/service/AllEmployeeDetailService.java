package com.petnolja.semi.admin.employee.model.service;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.dao.AllEmpSelectDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import org.apache.ibatis.session.SqlSession;

public class AllEmployeeDetailService {

	private AllEmpSelectDAO mapper;
	public EmployeeDTO allEmployeeDetail(String empId) {
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(AllEmpSelectDAO.class);
		
		EmployeeDTO empDTO = mapper.allEmployeeDetail(empId);
		
		return empDTO;
	}

}
