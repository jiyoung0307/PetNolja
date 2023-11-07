package com.petnolja.semi.admin.employee.model.dao;

import java.util.List;

import com.petnolja.semi.admin.common.dto.JobDTO;

public interface JobDAO {

	List<JobDTO> selectJob();

	int jobInsert(JobDTO jobInsert);

	int jobUpdate(JobDTO jobUpdate);

}
