package com.petnolja.semi.admin.sales;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.SalesDTO;
import com.petnolja.semi.admin.post.model.dao.AdminPostDAO;

public class SalesSelectService {
	
	private AdminPostDAO adminPostDAO;
	
	public List<SalesDTO> selectAllSales() {
		
		SqlSession sqlSession = getSqlSession();
		adminPostDAO = sqlSession.getMapper(AdminPostDAO.class);
		
		List<SalesDTO> salesList = adminPostDAO.selectSalesList();
		
		sqlSession.close();
		
		return salesList;
	}

	public List<SalesDTO> selectSalesListByDate(String paymentDate) {
		SqlSession sqlSession = getSqlSession();
		adminPostDAO = sqlSession.getMapper(AdminPostDAO.class);
		
		List<SalesDTO> salesList = adminPostDAO.selectSalesListByDate(paymentDate);
		
		sqlSession.close();
		
		return salesList;
	}

}
