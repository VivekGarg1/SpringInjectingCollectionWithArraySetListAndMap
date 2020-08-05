package com.home.client;

import java.util.List;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.info.OrgInfo;

public class ClientTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		OrgInfo orgInfo = context.getBean("orgInfo", OrgInfo.class);
		
		String[] namesArr = orgInfo.getNamesArr();
		for(String name:namesArr) {
			System.out.println(name);
		}
		
		System.out.println("===========");
		
		List<String> empList = orgInfo.getEmpList();
		for(String emp:empList) {
			System.out.println(emp);
		}
		
		System.out.println("===========");
		
		Set<Integer> empIdsSet = orgInfo.getEmpIdsSet();
		for(Integer empId:empIdsSet) {
			System.out.println(empId);
		}

	}

}
