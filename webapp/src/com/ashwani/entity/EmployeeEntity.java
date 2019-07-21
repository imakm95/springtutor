package com.ashwani.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class EmployeeEntity{
	@Id
	@Column(name="empno")
	private Integer empNo;
	@Column(name="ename")
	private String empName;
	@Column(name="job")
	private String jobType;
	@Column(name="mgr")
	private Integer mgr;
	@Column(name="hiredate")
	private Date hireDate; 
	@Column(name="sal")
	private Long salary;
	@Column(name="comm")
	private Long comm;
	@Column(name="deptno")
	private Integer deptNo;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Long getComm() {
		return comm;
	}
	public void setComm(Long comm) {
		this.comm = comm;
	}
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	
}
