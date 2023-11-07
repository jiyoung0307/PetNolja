package com.petnolja.semi.admin.employee.model.dao;

import java.util.List;
import java.util.Map;

import com.petnolja.semi.admin.common.dto.EmployeeDTO;

public interface AllEmpSelectDAO {

	List<EmployeeDTO> selectAllEmployee();

	List<EmployeeDTO> searchList(Map<String, String> searchMap);

	EmployeeDTO allEmployeeDetail(String empId);

}
