package zyzz3.business.conceretes;

import zyzz3.business.abstracts.AccountService;
import zyzz3.business.abstracts.UserCheckService;
import zyzz3.business.abstracts.UserService;
import zyzz3.business.abstracts.UserVerificationService;
import zyzz3.dataAcsess.abstracts.UserDao;
import zyzz3.entities.conceretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private UserCheckService userCheckService;
	private UserVerificationService userVerificationService;
	
	public UserManager(UserDao userDao, UserCheckService userCheckService, UserVerificationService userVerificationService) {
		super();
		this.userDao=userDao;
		this.userCheckService = userCheckService;
		this.userVerificationService = userVerificationService;
	}

	@Override
	public void register(User user) throws Exception {
		
		userCheckService.userCheckRegister(user);
	
		if(userVerificationService.userVerification(user)) {
			System.out.println("User verification is successful !");
			userDao.register(user);
			
		}
		else {
			throw new Exception("User verification is not successful !");
		}	
	}

	@Override
	public void login(String eMail, String password) throws Exception {
		
		User user=userCheckService.userCheckLogin(eMail, password);
		
		if(user != null) {
			System.out.println("Login successful : " + user.getFirstName());
		}
		else {
			throw new Exception("Login failed !");
		}
		
	}

	@Override
	public void register(AccountService accountService) {

		accountService.getAccount();
		System.out.println(" ile kayýt baþarýlý !");
	}

	@Override
	public void login(AccountService accountService) {

		accountService.getAccount();
		System.out.println(" ile giriþ baþarýlý !");
	}
	
	

}
