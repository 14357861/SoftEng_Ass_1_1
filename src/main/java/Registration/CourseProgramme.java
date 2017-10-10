package Registration;

import java.util.ArrayList;
import java.util.Date;

import org.joda.time.DateTime;

public class CourseProgramme {
	
	public CourseProgramme(String courseName, DateTime AcademicStartDate, DateTime AcademicEndDate) {
		this.courseName = courseName;
		this.AcademicStartDate = AcademicStartDate;
		this.AcademicEndDate = AcademicEndDate;
	}
	
	public String courseName;
	public ArrayList<Module> LoModules = new ArrayList<Module>();
	public DateTime AcademicStartDate;
	public DateTime AcademicEndDate;
	
	
	public void setModule(Module testModule) {
	
		this.LoModules.add(testModule);
	}
		
	public String toString() {
		
		return "Course: " +courseName+"\n"+"Module List: "+LoModules.get(0).ID
				+"\n"+"Student List: "+LoModules.get(0).LoStudents.toString();
	}
}
