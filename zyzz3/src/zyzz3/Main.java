package zyzz3;

import java.util.ArrayList;
import java.util.List;

import zyzz3.business.abstracts.UserService;
import zyzz3.business.conceretes.FacebookAccountManager;
import zyzz3.business.conceretes.GoogleAccountManager;
import zyzz3.business.conceretes.UserCheckManager;
import zyzz3.business.conceretes.UserEMailVerificationManager;
import zyzz3.business.conceretes.UserManager;
import zyzz3.dataAcsess.conceretes.HibernateUserDao;
import zyzz3.entities.conceretes.User;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user= new User(1, "Fati", "Üstün", "ab12@gmail.com", "1234ab");
		User user2= new User(2, "Mami", "Aydýn", "cd34@gmail.com", "4567cd");
		
		List<User> users = new ArrayList<>();
		
		UserService userService= new UserManager(new HibernateUserDao(), new UserCheckManager(users),
				new UserEMailVerificationManager());
		
		userService.register(user);
		userService.register(user2);
		
		userService.login("ab12@gmail.com", "1234ab");
		userService.login("cd34@gmail.com", "4567cd");
		
		userService.register(new GoogleAccountManager());
		userService.login(new GoogleAccountManager());
		
		userService.register(new FacebookAccountManager());
		userService.login(new FacebookAccountManager());
	}

}
