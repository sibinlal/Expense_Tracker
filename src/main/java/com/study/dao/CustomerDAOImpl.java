package com.study.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.study.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		System.out.println("Inside DAO class");

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName", Customer.class);

		// execute query and get result list
		List<Customer> customers = theQuery.getResultList();

		// return the results
		return customers;
	}

	@Override
	public void saveCustomer(Customer theCustomer) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/upate the customer ... finally LOL
		currentSession.saveOrUpdate(theCustomer);

	}

	@Override
	public Customer getCustomer(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Customer theCustomer = currentSession.get(Customer.class, theId);

		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Customer where id=:customerId");
		theQuery.setParameter("customerId", theId);

		theQuery.executeUpdate();
	}

	public List<Customer> autheticationCheck(Customer theCustomer) {
		System.out.println("inside dao impl");
		String uname = theCustomer.getUserName();
		String passwd = theCustomer.getPassword();
		System.out.println("DAO values: "+ uname + " "+ passwd);

		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession
				.createQuery("select * from Customer where userName=:uname and password=:password");
		theQuery.setParameter("uname", uname);
		theQuery.setParameter("password", passwd);
		
		List<Customer> customerList = new ArrayList<Customer>();
		customerList = theQuery.getResultList();
		
		for(Customer i : customerList) {
			System.out.println(i);
		}
		return customerList;

	}

}
