package com.home.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.info.OrgInfo;
import com.home.info.StudentInfo;
import com.home.model.Student;

public class CustomClientTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("CustomCollectionBeans.xml");
		StudentInfo studentInfo = context.getBean("studentInfo", StudentInfo.class);
		
		Student[] students = studentInfo.getStudentInfos();
		for(Student student:students) {
			System.out.println(student);
		}
		
		System.out.println("===========");
		
		List<Student> stuList = studentInfo.getStuList();
		for(Student stu:stuList) {
			System.out.println(stu);
		}
		
		System.out.println("===========");
		
		Set<Student> stuIdsSet = studentInfo.getStuSet();
		for(Student stuId:stuIdsSet) {
			System.out.println(stuId);
		}

	}

}
