package edu.iss.caps.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Enrolments")

public class Enrolment
{

	@Id
	@Column(name = "EnrolmentId")
	private int enrolmentId;
	@Basic(optional = false)
	@Column(name = "Grade")
	private String grade;
	@Column(name = "EarnedCredit")
	private Integer earnedCredit;

	@OneToOne
	@JoinColumn(name = "CourseId")
	Course courses;

	@OneToOne
	@JoinColumn(name = "StudentId")
	StudentDetail studentDetails;

	public Enrolment()
	{

	}

	public Enrolment(String studentId, int courseId, String grade, int earnedCredit, Course courses,
			StudentDetail studentDetails)
	{
		super();
		this.grade = grade;
		this.earnedCredit = earnedCredit;
		this.courses = courses;
		this.studentDetails = studentDetails;
	}

	public String getGrade()
	{
		return grade;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public int getEarnedCredit()
	{
		return earnedCredit;
	}

	public void setEarnedCredit(int earnedCredit)
	{
		this.earnedCredit = earnedCredit;
	}

	public Course getCourses()
	{
		return courses;
	}

	public void setCourses(Course courses)
	{
		this.courses = courses;
	}

	public StudentDetail getStudentDetails()
	{
		return studentDetails;
	}

	public void setStudentDetails(StudentDetail studentDetails)
	{
		this.studentDetails = studentDetails;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courses == null) ? 0 : courses.hashCode());
		result = prime * result + earnedCredit;
		result = prime * result + enrolmentId;
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((studentDetails == null) ? 0 : studentDetails.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enrolment other = (Enrolment) obj;
		if (courses == null)
		{
			if (other.courses != null)
				return false;
		} else if (!courses.equals(other.courses))
			return false;
		if (earnedCredit != other.earnedCredit)
			return false;
		if (enrolmentId != other.enrolmentId)
			return false;
		if (grade == null)
		{
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (studentDetails == null)
		{
			if (other.studentDetails != null)
				return false;
		} else if (!studentDetails.equals(other.studentDetails))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Enrolment [enrolmentId=" + enrolmentId + ", grade=" + grade + ", earnedCredit=" + earnedCredit
				+ ", courses=" + courses + ", studentDetails=" + studentDetails + "]";
	}

}
