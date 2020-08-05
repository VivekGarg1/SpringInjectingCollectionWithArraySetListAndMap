package com.home.info;

import java.util.Map;

import com.home.model.Student;

public class CompanyInfo {

	private Map<Integer,String> empIdAndNameMap;
	private Map<Integer,Student> stuMap;
	
	public Map<Integer, String> getEmpIdAndNameMap() {
		return empIdAndNameMap;
	}
	public void setEmpIdAndNameMap(Map<Integer, String> empIdAndNameMap) {
		this.empIdAndNameMap = empIdAndNameMap;
	}
	public Map<Integer, Student> getStuMap() {
		return stuMap;
	}
	public void setStuMap(Map<Integer, Student> stuMap) {
		this.stuMap = stuMap;
	}
	
}
