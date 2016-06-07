package com.aeq.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.aeq.bean.AddressBean;
import com.aeq.bean.EmployeeBean;


public class FetchCompanyInfo {
public static void main(String[] args) {

	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	Query query=session.createQuery("from EmployeeBean");
	List<EmployeeBean> list=query.list();
	Iterator<EmployeeBean> iterator=list.iterator();
	while (iterator.hasNext()) {
		EmployeeBean employeeBean = (EmployeeBean) iterator.next();
		System.out.println(employeeBean.getEmployeeid()+""+employeeBean.getName()+""+employeeBean.getEmail());
	AddressBean addressBean=employeeBean.getAddress();
	System.out.println(addressBean.getAddresline1()+""+addressBean.getCity()+""+addressBean.getState()+""+addressBean.getCountry()+""+addressBean.getPincode());
	
	}
	session.close();
	System.out.println("Success");
	}
	

}
