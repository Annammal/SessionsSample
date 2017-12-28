package com.aeq.controller;

import javax.servlet.http.HttpServlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aeq.bean.AddressBean;
import com.aeq.bean.EmployeeBean;

public class CompanyController extends HttpServlet
{

	public static void main(String[] args) {
		Configuration configuration=new Configuration().configure();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setName("shoba");
		employeeBean.setEmail("annalsam165@gmail.com");
		AddressBean addressBean=new AddressBean();
		addressBean.setAddresline1("621,East Street,Keelaneduvai");
		addressBean.setCity("Jeyankondam");
		addressBean.setState("Tamil Nadu");
		addressBean.setCountry("India");
		addressBean.setPincode(621809);

		employeeBean.setAddress(addressBean);
		addressBean.setEmployee(employeeBean);
		session.persist(employeeBean);
		transaction.commit();
		session.close();
		System.out.println("Success");
			}
}
