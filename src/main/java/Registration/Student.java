package Registration;

import java.util.Date;

public class Student {

	public String Name;
	public int Age;
	public Date DOB;
	public int ID;
	public String userName;
	
	public Student(String Name, int Age, Date DOB, int ID) {
		this.Name = Name;
		this.Age = Age;
		this.DOB = DOB;
		this.ID = ID;
	}
	public String getUserName() {
		return Name+Age;
	}
	
	public String toString() {
		return Name;
		
	}
//	public void setName(String name) {
//		this.Name = name;
//	}
//	public void setAge(int age) {
//		this.Age = age; 
//	}
//	public void setDOB(Date dob) {
//		this.DOB = dob;
//	}
//	public void setID(int id) {
//		this.ID = id; 
//	}

}
