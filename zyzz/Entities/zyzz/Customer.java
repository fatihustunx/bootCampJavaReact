package zyzz;

import java.text.DateFormat;

public class Customer implements IEntity{

	private int Id;
	private String FirstName;
	private String LastName;
	private String NationalityID;
	private DateFormat DateOfBirth;
	
	public Customer(int id, String firstName, String lastName, String nationalityID, DateFormat dateOfBirth) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		NationalityID = nationalityID;
		DateOfBirth = dateOfBirth;
	}
	
	public int getID() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getNationalityID() {
		return NationalityID;
	}
	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
	}

	public DateFormat getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(DateFormat dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	
}
