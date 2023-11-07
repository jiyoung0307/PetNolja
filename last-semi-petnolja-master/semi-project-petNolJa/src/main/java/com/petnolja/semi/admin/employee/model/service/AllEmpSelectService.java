package com.petnolja.semi.admin.employee.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.dao.AllEmpSelectDAO;

public class AllEmpSelectService {
	private AllEmpSelectDAO allEmpSelectDAO;
	
	public List<EmployeeDTO> selectAllEmp() {
		SqlSession sqlSession = getSqlSession();
		allEmpSelectDAO = sqlSession.getMapper(AllEmpSelectDAO.class);
		
		List<EmployeeDTO> allEmployeeList = allEmpSelectDAO.selectAllEmployee();
		
		sqlSession.close();
		
		return allEmployeeList;
	}
}