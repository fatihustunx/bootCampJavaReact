package zyzz3.business.abstracts;

import zyzz3.entities.conceretes.User;

public interface UserCheckService {

	boolean userCheckRegister(User user) throws Exception;
	User userCheckLogin(String eMail, String password) throws Exception;
}
