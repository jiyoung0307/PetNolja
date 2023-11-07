package com.petnolja.semi.member.post.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;
import com.petnolja.semi.common.paging.Pagenation;
import com.petnolja.semi.common.paging.SelectCriteria;
import com.petnolja.semi.member.post.model.service.MemberPostService;

@WebServlet("/petsitter/postList")
public class PetsitterPostListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String currentPage = request.getParameter("currentPage");
		int pageNo = 1;
		
		if(currentPage != null && !"".equals(currentPage)) {
			pageNo = Integer.parseInt(currentPage);
		}
		
		String searchCondition = request.getParameter("searchCondition");
		String searchValue = request.getParameter("searchValue");
		
		Map<String, String> searchMap = new HashMap<>();
		searchMap.put("searchCondition", searchCondition);
		searchMap.put("searchValue", searchValue);
		
		/* 전체 게시물 수가 필요하다.
		 * 데이터베이스에서 먼저 전체 게시물 수를 조회해올 것이다.
		 * 검색조건이 있는 경우 검색 조건에 맞는 전체 게시물 수를 조회한다.
		 */
		MemberPostService memberPostService = new MemberPostService();
		int totalCount = memberPostService.selectTotalCount(searchMap);
		
		System.out.println("totalBoardCount : " + totalCount);
		
		/* 한 페이지에 보여 줄 게시물 수 */
		int limit = 6;		//얘도 파라미터로 전달받아도 된다.
		/* 한 번에 보여질 페이징 버튼의 갯수 */
		int buttonAmount = 3;
		
		/* 페이징 처리를 위한 로직 호출 후 페이징 처리에 관한 정보를 담고 있는 인스턴스를 반환받는다. */
		SelectCriteria selectCriteria = null;
		
		if(searchCondition != null && !"".equals(searchValue)) {
			selectCriteria = Pagenation.getSelectCriteria(pageNo, totalCount, limit, buttonAmount, searchCondition, searchValue);
		} else {
			selectCriteria = Pagenation.getSelectCriteria(pageNo, totalCount, limit, buttonAmount);
		}
		
		System.out.println(selectCriteria);

		List<PetsitterPostDTO> petsitterPostList = memberPostService.selectPetsitterPostList(selectCriteria);
		
		for(PetsitterPostDTO board : petsitterPostList) {
			System.out.println(board);
		}
		
		String path = "";
		HttpSession session = request.getSession();
		if(session.getAttribute("role").equals("admin")) {
			path = "/WEB-INF/views/admin/post/adminPetsitterList.jsp";
			request.setAttribute("petsitterPostList", petsitterPostList);
			request.setAttribute("selectCriteria", selectCriteria);
		} else {
			if(petsitterPostList != null) {
				path = "/WEB-INF/views/member/post/petsitterPostList.jsp";
				request.setAttribute("petsitterPostList", petsitterPostList);
				request.setAttribute("selectCriteria", selectCriteria);
			} else {
				path = "/WEB-INF/views/common/memberFailedPage.jsp";
				request.setAttribute("message", "썸네일 게시판 조회 실패!");
			}
		}
		request.getRequestDispatcher(path).forward(request, response);
	}
}
