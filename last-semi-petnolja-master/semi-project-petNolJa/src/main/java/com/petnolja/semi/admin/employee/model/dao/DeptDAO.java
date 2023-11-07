package com.petnolja.semi.admin.employee.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.DeptDTO;

public interface DeptDAO {

	List<DeptDTO> selectDept();

	int deptInsert(DeptDTO deptInsert);

	int deptUpdate(DeptDTO deptUpdate);

}
