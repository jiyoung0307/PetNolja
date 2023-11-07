package com.petnolja.semi.admin.employee.model.service;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.admin.employee.model.dao.AdminDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

public class AdminLogInService {
	private AdminDAO adminDAO;
	
	public EmployeeDTO empLogInCheck(Map<String, String> logIn) {
		SqlSession sqlSession = getSqlSession();
		adminDAO = sqlSession.getMapper(AdminDAO.class);
		EmployeeDTO loginEmployee = null;
		
		int empId = Integer.valueOf(logIn.get("id"));
		System.out.println("empID" + empId);
		
		String empPwd = adminDAO.selectAdminPwd(empId);
		System.out.println(empPwd);
		
		if(empPwd.replaceAll("[0-9]", "").equals("")) {
			loginEmployee = adminDAO.selectLogInEmployee(logIn);
		} else {
			String encPwd = adminDAO.selectEncryptedPwd(empId);
			
			BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
			
			if(passwordEncoder.matches(logIn.get("pwd"), encPwd)) {
				loginEmployee = adminDAO.selectLogInEmployee(logIn);
			}
		}
		loginEmployee.setPassword(logIn.get("pwd"));
		System.out.println(loginEmployee.getPassword());
		
		int logResult = adminDAO.insertLoginLog(empId);
		
		if(logResult > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return loginEmployee;
	}

	public int updateEmpPwd(Map<String, String> empMap) {
		SqlSession sqlSession = getSqlSession();
		adminDAO = sqlSession.getMapper(AdminDAO.class);
		
		int result = adminDAO.updateEmpPwd(empMap);
		System.out.println("update result: " + result);
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

//	public List<AdminLogDTO> selectAdminLoginLog() {
//		
//		
//		
//		
//		
//		return null;
//	}

}
