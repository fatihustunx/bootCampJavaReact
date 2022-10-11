package zyzz3.business.conceretes;

import java.util.List;

import zyzz3.business.abstracts.UserCheckService;
import zyzz3.entities.conceretes.User;

public class UserCheckManager implements UserCheckService {
	
	private List<User> users;

	public UserCheckManager(List<User> users) {
		super();
		this.users = users;
	}

	@Override
	public boolean userCheckRegister(User user) throws Exception {

		if(user.getFirstName().length()<2 || user.getLastName().length()<2) {
			throw new Exception("Ad ve soyad en az 2 karakter olmaýlýdýr !");
		}
		if(user.getPassword().length()<6) {
			throw new Exception("Parola en az 6 karakterden oluþmalýdýr !");
		}
		
		String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+"
				+ "@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(user.geteMail());
       if(!m.matches()) {
    	   throw new Exception("E-mail adresi geçersiz !");
       }
       
       if(users==null) {
    	   users.add(user);
    	   return true;
       }
       else {
    	   for (User user2 : users) { 
    		   if(user.geteMail()==user2.geteMail()) {
    			   throw new Exception("E-mail daha önce kullanýlmýþtýr !");
    		   }
    	   }
       }
       
       users.add(user);
       return true;
	}

	@Override
	public User userCheckLogin(String eMail, String password) throws Exception {
		
		if(users==null) {
			throw new Exception("No registered users !");
		}
		
		for (User user : users) {
			if(user.geteMail()==eMail) {
				if(user.getPassword()==password) {
					return user;
				}else {
					throw new Exception("Password is not valid !");
				}
			}
		}
		throw new Exception("E-Mail is not valid !");
	}

}
