package com.petnolja.semi.admin.post.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.AdminPictureDTO;
import com.petnolja.semi.admin.common.dto.CompanyPostDTO;
import com.petnolja.semi.admin.common.dto.LocationPostDTO;
import com.petnolja.semi.admin.common.dto.PetsitterPostDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndAdminPictureDTO;
import com.petnolja.semi.admin.common.dto.RoomPostAndEmployeeDTO;
import com.petnolja.semi.admin.common.dto.RoomPostDTO;
import com.petnolja.semi.admin.common.dto.SalesDTO;
import com.petnolja.semi.admin.common.dto.SelectRoomDetailDTO;
public interface AdminPostDAO {

	int insertPetsitterPost(PetsitterPostDTO petsitterPost);

	int insertAdminPicture(AdminPictureDTO adminPicture);

	List<RoomPostAndEmployeeDTO> selectRoomList();

	SelectRoomDetailDTO selectRoomDetail(String roomPostNo);

	int updateRoomPost(RoomPostDTO roomPostDTO);
	
	int inserRoomPost(RoomPostDTO insertRoomPostDTO);

	int insertThumbnailContent(RoomPostAndAdminPictureDTO thumbnail);

	int insertAttachment(AdminPictureDTO adminPictureDTO);

	int UpdateRoomPost(RoomPostAndAdminPictureDTO thumbnail);

	int updateAttachment(AdminPictureDTO adminPictureDTO);

	PetsitterPostDTO selectPetsitterPost(int petsitterPostNo);

	int updatetPetsitterPost(PetsitterPostDTO petsitterPost);

	int updateAdminPicture(AdminPictureDTO adminPicture);

	int deletePetsitterPost(int petsitterPostNo);

	int deletePetsitterPicture(int petsitterPostNo);

	int deleteRoomPicture(String roomPostNo);

	int deleteRoomPost(String roomPostNo);
	
	List<SalesDTO> selectSalesList();

	List<CompanyPostDTO> selectCompanyPostList();
	
	CompanyPostDTO selectCompanyPost();

	int updateCompanyPost(CompanyPostDTO companyPostDTO);
	
	LocationPostDTO selectLocationPost();

	int updateLocationPost(LocationPostDTO locationPostDTO);

	LocationPostDTO getLocationPost(String locationPostNo);

	List<SalesDTO> selectSalesListByDate(String paymentDate);
	
}
