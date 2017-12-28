package com.aeq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.aeq.bean.AddressBean;
import com.aeq.bean.EmployeeBean;


@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Configuration configuration=new Configuration().configure();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		EmployeeBean employeeBean=new EmployeeBean();
		employeeBean.setName("shoba");
		employeeBean.setEmail("annalsam165@gmail.com");
		AddressBean addressBean=new AddressBean();
		addressBean.setAddresline1("621,East Street,VaradarajanPettai");
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
