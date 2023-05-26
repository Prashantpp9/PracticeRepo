package com.app.pojos;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column(name = "mbl_number")
	private String mblNumber;
//	@Lob
//	@Column(columnDefinition = "MEDIUMBLOB")
//	private String image;

	@ManyToMany // mandatory , o.w MappingExc
	//annotation below : optional BUT reco for customizing names of the link table n it's cols
	@JoinTable(name = "emp_dept", joinColumns = @JoinColumn(name = "employee_id"), inverseJoinColumns = @JoinColumn(name = "department_id"))
	private Set<Department> dept = new HashSet<>();
	
	public Employee() {

	}
	

	public Employee(String firstName, String lastName, String email, String password, String mblNumber) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.password = password;
	this.mblNumber = mblNumber;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMblNumber() {
		return mblNumber;
	}

	public void setMblNumber(String mblNumber) {
		this.mblNumber = mblNumber;
	}

//	public String getImage() {
//		return image;
//	}
//
//	public void setImage(String image) {
//		this.image = image;
//	}

	@Override
	public String toString() {
		return "Employee [empId=" + getId() + "firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mblNumber=" + mblNumber + "]";
	}

}
