package zyzz3.business.conceretes;

import zyzz3.business.abstracts.AccountService;
import zyzz3.entities.conceretes.User;

public class GoogleAccountManager implements AccountService {

	@Override
	public User getAccount() {

		System.out.print("Google");
		
		return null;
	}

}
