package com.petnolja.semi.member.post.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.common.paging.SelectCriteria;
import com.petnolja.semi.member.common.dto.CompanyDTO;
import com.petnolja.semi.member.common.dto.LocationDTO;

public interface MemberPostDAO {

	List<PetsitterPostDTO> selectPetsitterPostList(SelectCriteria selectCriteria);

	int increamentPetsitterPostCount(int petsitterPostNo);

	PetsitterPostDTO selectPetsitterPostDetail(int petsitterPostNo);

	List<RoomPostAndAdminPictureDTO> SelectRoomListParameter();

	RoomPostAndAdminPictureDTO selectRoomDetailParameter(String roomPostNo);

	int selectTotalCount(Map<String, String> searchMap);
	
	LocationDTO selectLocationPost();
	
	CompanyDTO selectCompanyPost();
}
