package coffeeApp.Entities;

import java.util.Date;

import coffeeApp.Abstract.ICustomer;

public class Customer implements ICustomer {
	String nationalityId;
	String firstName;
	String lastName;
	int dateOfBirth;

	
	public Customer(){
		
	}
	/*public Customer(int id, String firstName, String lastName, Date dateOfBirth, long nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}*/
	public Customer(String nationalityId, String firstName, String lastName, int dateOfBirth) {
		super();
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		
	}

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
