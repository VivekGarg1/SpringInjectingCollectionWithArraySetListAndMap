package com.home.info;

import java.util.List;
import java.util.Set;

public class OrgInfo {
	
	private String namesArr[]=new String[1];
	private List<String> empList;
	private Set<Integer> empIdsSet;
	public String[] getNamesArr() {
		return namesArr;
	}
	public void setNamesArr(String[] namesArr) {
		this.namesArr = namesArr;
	}
	public List<String> getEmpList() {
		return empList;
	}
	public void setEmpList(List<String> empList) {
		this.empList = empList;
	}
	public Set<Integer> getEmpIdsSet() {
		return empIdsSet;
	}
	public void setEmpIdsSet(Set<Integer> empIdsSet) {
		this.empIdsSet = empIdsSet;
	}
	
	

}
