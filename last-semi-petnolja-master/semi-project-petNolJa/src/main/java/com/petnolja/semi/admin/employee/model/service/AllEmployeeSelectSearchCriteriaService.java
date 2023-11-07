package com.petnolja.semi.admin.employee.model.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.dao.AllEmpSelectDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
public class AllEmployeeSelectSearchCriteriaService {

	AllEmpSelectDAO mapper;
	public List<EmployeeDTO> searchList(Map<String, String> searchMap) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(AllEmpSelectDAO.class);
		
		List<EmployeeDTO> searchList = mapper.searchList(searchMap);
		
		sqlSession.close();
		
		return searchList;
	}
	
}
