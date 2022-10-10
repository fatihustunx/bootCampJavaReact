package zyzz3.dataAcsess.conceretes;

import zyzz3.dataAcsess.abstracts.UserDao;
import zyzz3.entities.conceretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void register(User user) {

		System.out.println("Hibernate ile eklendi : " + user.getFirstName());
	}

}
