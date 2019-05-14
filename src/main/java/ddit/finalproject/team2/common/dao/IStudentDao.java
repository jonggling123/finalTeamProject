package ddit.finalproject.team2.common.dao;

import org.springframework.stereotype.Repository;

import ddit.finalproject.team2.vo.StudentVo;

@Repository
public interface IStudentDao {
	public String getFaceId(String userId);
	
	public int updateFaceId(StudentVo student);
	
}
