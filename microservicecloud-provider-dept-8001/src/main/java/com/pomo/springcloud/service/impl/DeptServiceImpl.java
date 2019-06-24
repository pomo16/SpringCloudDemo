package com.pomo.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pomo.springcloud.dao.DeptDao;
import com.pomo.springcloud.entities.Dept;
import com.pomo.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;

	@Override
	public boolean add(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long Id) {
		return dao.findById(Id);
	}

	@Override
	public List<Dept> list() {
		return dao.findAll();
	}

}
