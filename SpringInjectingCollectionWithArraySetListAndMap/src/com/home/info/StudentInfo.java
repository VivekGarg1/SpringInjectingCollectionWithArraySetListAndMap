package com.home.info;

import java.util.List;
import java.util.Set;

import com.home.model.Student;

public class StudentInfo {

	private Student[] studentInfos=new Student[2];
	private List<Student> stuList;
	private Set<Student> stuSet;
	
	public Student[] getStudentInfos() {
		return studentInfos;
	}
	public void setStudentInfos(Student[] studentInfos) {
		this.studentInfos = studentInfos;
	}
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public Set<Student> getStuSet() {
		return stuSet;
	}
	public void setStuSet(Set<Student> stuSet) {
		this.stuSet = stuSet;
	}
	
	
}
