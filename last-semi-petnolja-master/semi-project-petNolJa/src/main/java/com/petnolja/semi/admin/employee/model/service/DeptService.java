package com.petnolja.semi.admin.employee.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
import com.petnolja.semi.admin.common.dto.DeptDTO;
import com.petnolja.semi.admin.employee.model.dao.DeptDAO;

public class DeptService {
	private DeptDAO deptDAO;

	public List<DeptDTO> selectDept() {
		SqlSession sqlSession = getSqlSession();
		deptDAO = sqlSession.getMapper(DeptDAO.class);
		
		List<DeptDTO> deptList = deptDAO.selectDept();
//		DeptDTO selectDept = deptDAO.selectDept(deptNo);
		
		sqlSession.close();
		
		return deptList;
	}

	public int deptInsert(DeptDTO deptInsert) {
		SqlSession sqlSession = getSqlSession();
		
		deptDAO = sqlSession.getMapper(DeptDAO.class);
		
		int result = deptDAO.deptInsert(deptInsert);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}

	public int deptUpdate(DeptDTO deptUpdate) {
		SqlSession sqlSession = getSqlSession();
		
		deptDAO = sqlSession.getMapper(DeptDAO.class);
//		System.out.println("deptDTO 보유 값: " + deptUpdate);		
		
		int result = deptDAO.deptUpdate(deptUpdate);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}

}
