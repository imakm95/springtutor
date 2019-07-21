package com.ashwani.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.ashwani.bean.Employee;
import com.ashwani.dao.DaoImpl;
import com.ashwani.entity.EmployeeEntity;

public class ServiceImpl {
	public List<Employee> getEmployeeList() {
		SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yy");
		DaoImpl d = new DaoImpl();
		List<EmployeeEntity> list = d.getAllEmployee();
		List<Employee> elist = new ArrayList<Employee>();
		for (EmployeeEntity employeeEntity : list) {
			Employee e = new Employee();
			e.setEmpName(employeeEntity.getEmpName());
			e.setEmpNo(employeeEntity.getEmpNo());
			e.setDeptNo(employeeEntity.getDeptNo());
			e.setComm(employeeEntity.getComm());
			e.setHireDate(sf.format(employeeEntity.getHireDate()));
			e.setJobType(employeeEntity.getJobType());
			e.setMgr(employeeEntity.getMgr());
			e.setSalary(employeeEntity.getSalary());
			elist.add(e);
//			System.out.println("EmpName: "+e.getEmpName()+"		EmpNo: "+e.getEmpNo()+"		DeptNo: "+e.getDeptNo()+"	   HireDate: "+sf.format(e.getHireDate())+"		Salary: "+e.getSalary()+"		Comm: "+e.getComm()+"	    JobType: "+e.getJobType()+"	      Mgr: "+e.getMgr());
		}
		return elist;
		
	}
}
