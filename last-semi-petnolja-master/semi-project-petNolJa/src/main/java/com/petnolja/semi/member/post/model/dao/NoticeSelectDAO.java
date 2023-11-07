package com.petnolja.semi.member.post.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.AdminPostDTO;

public interface NoticeSelectDAO {

	List<AdminPostDTO> selectAllNotice();

	AdminPostDTO noticeDetail(String noticeNo);

}
	