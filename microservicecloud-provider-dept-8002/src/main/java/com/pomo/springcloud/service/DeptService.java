package com.pomo.springcloud.service;

import java.util.List;
import com.pomo.springcloud.entities.Dept;

public interface DeptService {
	
	public boolean add(Dept dept);
	
	public Dept get(Long Id);
	
	public List<Dept> list();
}
