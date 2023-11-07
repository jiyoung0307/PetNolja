package com.petnolja.semi.admin.employee.model.service;

import java.util.List;
import static com.petnolja.semi.common.mybatis.Template.getSqlSession;
import org.apache.ibatis.session.SqlSession;

import com.petnolja.semi.admin.common.dto.JobDTO;
import com.petnolja.semi.admin.employee.model.dao.JobDAO;

public class JobService {
	private JobDAO jobDAO;
	
	public List<JobDTO> selectJob() {
		SqlSession sqlSession = getSqlSession();
		jobDAO = sqlSession.getMapper(JobDAO.class);
		
		List<JobDTO> jobList = jobDAO.selectJob();
		
		sqlSession.close();
		
		return jobList;
	}

	public int jobInsert(JobDTO jobInsert) {
		SqlSession sqlSession = getSqlSession();
		
		jobDAO = sqlSession.getMapper(JobDAO.class);
		
		int result = jobDAO.jobInsert(jobInsert);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}

	public int jobUpdate(JobDTO jobUpdate) {
		SqlSession sqlSession = getSqlSession();
		
		jobDAO = sqlSession.getMapper(JobDAO.class);
//		System.out.println("jobDTO 보유 값: " + jobUpdate);
		
		int result = jobDAO.jobUpdate(jobUpdate);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result;
	}



	

}
