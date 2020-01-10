package com.johnabbott.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.johnabbott.test.model.Student;

@Repository
public class HibernateStudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int insertStudent(Student std) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Student> getStudents() {
		return getSession().createQuery("from Student", Student.class).list();
	}

	@Override
	public Student getStudentById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int studentId) {
		return true;
	}

	@Override
	public boolean updateStudent(Student std) {
		// TODO Auto-generated method stub
		return false;
	}

	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
}
