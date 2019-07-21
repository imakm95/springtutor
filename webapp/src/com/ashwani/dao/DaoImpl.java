package com.ashwani.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.ashwani.entity.EmployeeEntity;
import com.ashwani.utility.HibernateUtility;

public class DaoImpl {
	public List<EmployeeEntity> getAllEmployee(){
		List<EmployeeEntity> l = new ArrayList<>();
		 HibernateUtility.loadSessionFactory();
		Session s = HibernateUtility.getSession();
		try {
			String hql="from EmployeeEntity";
			TypedQuery<EmployeeEntity> q = s.createQuery(hql);
			l = q.getResultList();
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		return l;
	}
}