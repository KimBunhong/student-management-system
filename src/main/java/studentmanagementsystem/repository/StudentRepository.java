package studentmanagementsystem.repository;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import studentmanagementsystem.entity.Student;

@Repository
public interface StudentRepository {

	@Delete("DELETE FROM student WHERE s_id=#{id}")
	boolean remove(@Param("id")int id);
	
	@Update("Update student Set s_name=#{name}, s_gender=#{gender}, s_address=#{address} WHERE s_id=#{id}")
	boolean update(Student student);
	
	@Insert("Insert INTO student (s_name,s_gender,s_address) Values(#{name}, #{gender}, #{email})")
	boolean save(Student student);
	
	@Select("Select * from student")
	@Results({
		@Result(property="id", column="s_id"),
		@Result(property="name", column="s_name"),
		@Result(property="gender", column="s_gender"),
		@Result(property="address", column="s_address")
	})
	ArrayList<Student> findAll();
	
	//where is your db?
	@Select("Select * from student Where s_id=#{id}")
	@Results({
		@Result(property="id", column="s_id"),
		@Result(property="name", column="s_name"),
		@Result(property="gender", column="s_gender"),
		@Result(property="address", column="s_address")
	})
	Student findOne(@Param("id")int id);
	
}
