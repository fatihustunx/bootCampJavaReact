package zyzz3.business.abstracts;

import zyzz3.entities.conceretes.User;

public interface UserService {

	void register(User user) throws Exception;
	void register(AccountService accountService);
	void login(String eMail, String password) throws Exception;
	void login(AccountService accountService);
	
}