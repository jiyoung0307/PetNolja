package com.petnolja.semi.member.regist.model.service;
import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.PointAccDTO;
import com.petnolja.semi.member.regist.controller.pointAccServlet;
import com.petnolja.semi.member.regist.model.dao.MemberDAO;

public class PointSearchCriteriaService {
	
	private MemberDAO mapper;
	public List<PointAccDTO> selectPointList(Map<String, String> pointMap) {

		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(MemberDAO.class);
		List<PointAccDTO> pointList = mapper.selectPointList(pointMap);
		
		return pointList;
	}
	
	public List<PointAccDTO> getPointAcc (int memberNo) {
		SqlSession sqlSession = getSqlSession();
		
		mapper = sqlSession.getMapper(MemberDAO.class);
		List<PointAccDTO> memberPoint = mapper.getparameter(memberNo);
		return memberPoint;
	}


}
