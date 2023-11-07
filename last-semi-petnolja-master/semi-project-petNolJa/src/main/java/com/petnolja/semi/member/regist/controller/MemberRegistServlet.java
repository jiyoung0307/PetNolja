package com.petnolja.semi.member.regist.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.petnolja.semi.member.common.dto.MemberDTO;
import com.petnolja.semi.member.regist.model.service.MemberService;

@WebServlet("/member/regist")
public class MemberRegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* regist1에서 get 요청으로 넘어왔기 때문에 doGet 메소드로 forward하여 WEB-INF 내에 있는 회원가입 다음 단계 jsp로 이동 */
		request.getRequestDispatcher("/WEB-INF/views/member/regist/regist2.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* regist2에서 post 요청으로 넘어왔으나 인코딩 필터를 미리 설정해놔서 인코딩 따로 필요 없음! 여기서 부터는 미니 프로젝트처럼 Service -> DAO -> MAPPER(remix 버전으로 xml 이름은 DAO와 동일) -> DB 순으로 다녀오면 됨! */
		String memberId = request.getParameter("memberId");
		String memberPwd = request.getParameter("memberPwd");
		String memberName = request.getParameter("memberName");
		java.sql.Date memberBirth = java.sql.Date.valueOf(request.getParameter("memberBirth"));
		
		/* DB로 저장되는 핸드폰 번호 양식이 동일하게 저장되도록 설정 */
		String memberPhone = request.getParameter("memberPhone").replace("-", "");
		memberPhone = memberPhone.substring(0, 3) + "-" + memberPhone.substring(3, 7) + "-" + memberPhone.substring(7);
		
		String memberEmail = request.getParameter("memberEmail");
		
		/* DB에 값을 넘겨주기 편하도록 DTO 형태로 묶어주기 */
		MemberDTO registMember = new MemberDTO();
		registMember.setMemberId(memberId);
		registMember.setMemberPwd(memberPwd);
		registMember.setMemberName(memberName);
		registMember.setMemberBirth(memberBirth);
		registMember.setMemberPhone(memberPhone);
		registMember.setMemberEmail(memberEmail);
		
		/* 위에서 묶은 값들을 Service로 넘겨주기 */
		int result = new MemberService().registMember(registMember);
		
		/*
		 * 반환된 숫자를 기준으로 성공/실패 페이지로 redirect 해서 넘기기
		 * 1. redirect의 이유 -> 여러번 Insert 되지 않도록 하기 위해서
		 * 2. 반환값을 숫자로 잡은 이유 -> DML(INSERT, UPDATE, DELETE)의 경우 실행 된 행의 수가 반환 됨!
		 */
		
		if(result > 0) {
			response.sendRedirect("../member/regist/complete");
		} else {
			response.sendRedirect("memberFailedPage");
		}
		
	}

}
