package edu.iss.caps.model;

import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentDetails")
public class StudentDetail {
	
	@Id
	@Column(name = "StudentId")
	private String studentId;
	@Basic(optional = false)
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "EnrolmentDate")
	private Date enrolmentDate;
	
	public StudentDetail(){
		
	}

	

	public StudentDetail(String studentId, String firstName, String lastName, Date enrollmentDate)
	{
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.enrolmentDate = enrolmentDate;
	}


	public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
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



	public Date getEnrollmentDate() {
		return enrolmentDate;
	}



	public void setEnrollmentDate(Date enrollmentDate) {
		this.enrolmentDate = enrollmentDate;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentDetail other = (StudentDetail) obj;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "StudentDetails [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", enrolmentDate=" + enrolmentDate + "]";
	}
	
}
