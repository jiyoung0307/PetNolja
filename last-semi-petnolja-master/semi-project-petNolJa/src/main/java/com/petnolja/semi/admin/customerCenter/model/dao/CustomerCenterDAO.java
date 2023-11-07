package com.petnolja.semi.admin.customerCenter.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.admin.common.dto.AdminPostAndEmployeeDTO;
import com.petnolja.semi.admin.common.dto.AdminPostDTO;

public interface CustomerCenterDAO {

	List<AdminPostAndEmployeeDTO> selectAllAdminPost(int categoryNo);

	int inserAdminPost(AdminPostDTO adminPost);

	AdminPostAndEmployeeDTO selectDetailNotice(Map<String, Integer> info);

	int deleteAdminPost(int noticeNo);

	AdminPostAndEmployeeDTO selectDetailNoticea(int noticeNo);

	int UpdateAdminPost(AdminPostAndEmployeeDTO notice);

}
