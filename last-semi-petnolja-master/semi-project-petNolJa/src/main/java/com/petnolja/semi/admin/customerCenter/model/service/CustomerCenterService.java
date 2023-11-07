package com.petnolja.semi.admin.customerCenter.model.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.AdminPostAndEmployeeDTO;
import com.petnolja.semi.admin.common.dto.AdminPostDTO;
import com.petnolja.semi.admin.customerCenter.model.dao.CustomerCenterDAO;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

public class CustomerCenterService {
	private CustomerCenterDAO customerCenterDAO;
	
	public List<AdminPostAndEmployeeDTO> selectAllAdminPost(int categoryNo) {
		SqlSession sqlSession = getSqlSession();
		customerCenterDAO = sqlSession.getMapper(CustomerCenterDAO.class);
		
		List<AdminPostAndEmployeeDTO> adminList = customerCenterDAO.selectAllAdminPost(categoryNo);
		
		sqlSession.close();
		return adminList;
	}
	
	public int inserAdminPost(AdminPostDTO adminPost) {
		SqlSession sqlSession = getSqlSession();
		customerCenterDAO = sqlSession.getMapper(CustomerCenterDAO.class);
		
		int result = customerCenterDAO.inserAdminPost(adminPost);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}
	
	public AdminPostAndEmployeeDTO selectDetailNotice(Map<String, Integer> info) {
		SqlSession sqlSession = getSqlSession();
		customerCenterDAO = sqlSession.getMapper(CustomerCenterDAO.class);
		
		AdminPostAndEmployeeDTO admin = customerCenterDAO.selectDetailNotice(info);
		
		sqlSession.close();
		return admin;
	}
	public int deleteAdminPost(int noticeNo) {
		SqlSession sqlSession = getSqlSession();
		customerCenterDAO = sqlSession.getMapper(CustomerCenterDAO.class);
		
		int result = customerCenterDAO.deleteAdminPost(noticeNo);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}
	
	public AdminPostAndEmployeeDTO selectDetailNoticea(int noticeNo) {
		SqlSession sqlSession = getSqlSession();
		customerCenterDAO = sqlSession.getMapper(CustomerCenterDAO.class);
		
		AdminPostAndEmployeeDTO admin = customerCenterDAO.selectDetailNoticea(noticeNo);
		
		sqlSession.close();
		return admin;
	}
	
	public int UpdateAdminPost(AdminPostAndEmployeeDTO notice) {
		SqlSession sqlSession = getSqlSession();
		customerCenterDAO = sqlSession.getMapper(CustomerCenterDAO.class);
		
		int result = customerCenterDAO.UpdateAdminPost(notice);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		return result;
	}

}
