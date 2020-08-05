package com.home.client;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.info.CompanyInfo;
import com.home.info.OrgInfo;
import com.home.info.StudentInfo;
import com.home.model.Student;

public class MapClientTest {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("MapCollectionBeans.xml");
		CompanyInfo companyInfo = context.getBean("companyInfo", CompanyInfo.class);
		
		Map<Integer, String> empIdAndNameMap = companyInfo.getEmpIdAndNameMap();
		Set<Entry<Integer, String>> entrySet = empIdAndNameMap.entrySet();
		for(Entry<Integer, String> entry:entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		System.out.println("===========");
		
		Map<Integer, Student> stuMap = companyInfo.getStuMap();
		Set<Entry<Integer, Student>> stuEntrySet = stuMap.entrySet();
		for (Entry<Integer, Student> entry : stuEntrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}

	}

}
