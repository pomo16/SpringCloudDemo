package com.pomo.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.pomo.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	
	@Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE())")
	public boolean addDept(Dept dept);
	
	@Select("SELECT deptno,dname,db_source from dept where deptno=#{deptno}")
	public Dept findById(@Param("deptno")Long Id);
	
	@Select("SELECT deptno,dname,db_source from dept")
	public List<Dept> findAll();
}
