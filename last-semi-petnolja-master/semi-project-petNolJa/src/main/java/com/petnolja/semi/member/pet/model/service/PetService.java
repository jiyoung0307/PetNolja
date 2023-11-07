package com.petnolja.semi.member.pet.model.service;

import static com.petnolja.semi.common.mybatis.Template.getSqlSession;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.member.common.dto.PetDTO;
import com.petnolja.semi.member.pet.model.dao.PetDAO;

public class PetService {
	private PetDAO petDAO;
	
	public List<PetDTO> petSelect(int memberNo) {
		SqlSession sqlSession = getSqlSession();
		petDAO = sqlSession.getMapper(PetDAO.class);
		
		List<PetDTO> petList = petDAO.petSelect(memberNo);
		
		sqlSession.close();
		
		return petList;
		
	}

	public int petInsert(PetDTO petInsert) {
		
		System.out.println("serice에서 insert값: " + petInsert);
		
		SqlSession sqlSession = getSqlSession();
				
		petDAO = sqlSession.getMapper(PetDAO.class);
		
		int result = petDAO.petInsert(petInsert);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		sqlSession.close();
		
		return result;
	}


}
