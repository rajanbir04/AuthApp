package com.nagarro.userauthentication.dao;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nagarro.userauthentication.entity.User;
import com.nagarro.userauthentication.util.HibernateUtil;


@Repository
public class LoginandSignUpDao {

	/** To find whether the username and password entered by the user matches with
	 *	the data available in the database
	 *
	 * 
	 * @param username the username of the user
	 * @param password the password of the user
	 * @return boolean value after validating the username and password
	 */
	@RequestMapping("/user")
	public boolean validate(String username, String password) {
		try (Session session = HibernateUtil.getSessionFactoryvalidate().openSession()) {
			Query query;
			query = session.createQuery("FROM User U WHERE U.username = :username AND U.password =:password");
			query.setParameter("username", username);
			query.setParameter("password", password);
			User user = (User) ((org.hibernate.query.Query) query).uniqueResult();
			if (user != null) {
				return true;
			}
			return false;
		}
	}
	public void register(User user) {
		  Session session = HibernateUtil.getSessionFactoryvalidate().openSession();
		  session.beginTransaction();
          session.save(user);
          session.getTransaction().commit();
          session.close();
		 }
}