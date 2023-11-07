package com.petnolja.semi.admin.employee.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.admin.common.dto.AdminLogDTO;
import com.petnolja.semi.admin.common.dto.EmployeeDTO;
import com.petnolja.semi.member.common.dto.RoomPostAndAdminPictureDTO;

public interface AdminDAO {
	
	EmployeeDTO selectLogInEmployee(Map<String, String> logIn);
	
	String selectAdminPwd(int empId);

	String selectEncryptedPwd(int empId);

	int updateEmpPwd(Map<String, String> empMap);

	int insertLoginLog(int empId);

	List<AdminLogDTO> empLog(int empId);

}
