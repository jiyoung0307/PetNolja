package com.petnolja.semi.member.regist.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.common.dto.PointAccDTO;

public interface MemberDAO {

	/*
	 * 이곳은 DAO 역할 + Mapper 역할을 하는 인터페이스
	 * 위 package 경로와 동일하도록 mapper 폴더를 기준으로 모든 폴더명과 매퍼.xml 이름을 지금 현재 인터페이스 클래스와 동일하게 생성 필요
	 * (mapper의 경우 java build path에서 source로 등록하여 인식할 수 있도록 함!
	 *  즉, mapper 다음 경로 부터 com.~ 사용할 경우 src.main.java의 다음 경로인 com.~ 와 동일하게 패키지명을 설정할 수 있음)
	 * 
	 * 중요한 점은 xml에서 반환형 / 메소드명(id로 지정) / 매개변수 자료형 모두 일치하도록 해야 함!
	 */
	int registMember(MemberDTO registMember);
	
	int selectRegistCheck(Map<String, String> memberCheck);
	
	String selectEncryptedPwd(Map<String, String> logIn);
	
	MemberDTO selectLogInMember(Map<String, String> logIn);
	
	MemberDTO findId(MemberDTO memberDTO);
	
	List<PointAccDTO> selectPointList(Map<String, String> pointMap);

	List<PointAccDTO> getparameter(int memberNo);

	int insertWithdrawMember(MemberDTO memberLogin);

	
}
