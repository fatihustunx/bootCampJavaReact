package zyzz2;

import java.text.DateFormat;

public class Gamer {

	private int Id;
	private String NationalityID;
	private String FirstName;
	private String LastName;
	private DateFormat DateOfBearthYear;
	
	public Gamer(int id, String nationalityID, String firstName, String lastName, DateFormat dateOfBearthYear) {
		super();
		Id = id;
		NationalityID = nationalityID;
		FirstName = firstName;
		LastName = lastName;
		DateOfBearthYear = dateOfBearthYear;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNationalityID() {
		return NationalityID;
	}

	public void setNationalityID(String nationalityID) {
		NationalityID = nationalityID;
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

	public DateFormat getDateOfBearthYear() {
		return DateOfBearthYear;
	}

	public void setDateOfBearthYear(DateFormat dateOfBearthYear) {
		DateOfBearthYear = dateOfBearthYear;
	}
	
	
}
