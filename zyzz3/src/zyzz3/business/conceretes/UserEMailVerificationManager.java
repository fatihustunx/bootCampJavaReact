package zyzz3.business.conceretes;

import zyzz3.business.abstracts.UserVerificationService;
import zyzz3.entities.conceretes.User;

public class UserEMailVerificationManager implements UserVerificationService {

	@Override
	public boolean userVerification(User user) {

		System.out.println(user.geteMail() + " adresine doðrulama maili gönderildi !");
		
		if(checkIfClickOnTheLink()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean checkIfClickOnTheLink() {
		
		return true;
		
	}

}
