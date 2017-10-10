package Registration;

import java.awt.List;
import java.util.ArrayList;

public class Module {

	public String moduleName;
	public String ID;
	public ArrayList<Student> LoStudents = new ArrayList<Student>();

	
	public Module(String moduleName, String ID) {
		this.moduleName = moduleName;
		this.ID = ID;
	}
	
	public void setStudent(Student student) {
		this.LoStudents.add(student);
			
	}
	
	public String toString() {
		return LoStudents.toString();
		
	}
}
