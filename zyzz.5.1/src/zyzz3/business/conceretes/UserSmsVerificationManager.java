package zyzz3.business.conceretes;

import zyzz3.business.abstracts.UserVerificationService;
import zyzz3.entities.conceretes.User;

public class UserSmsVerificationManager implements UserVerificationService {

	@Override
	public boolean userVerification(User user) {

		System.out.println(user.getFirstName() + " adlý kullanýcýya sms gönderildi !");
		
		if(chechkIfSmsCode()) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean chechkIfSmsCode() {
		
		return true;
	}
}
