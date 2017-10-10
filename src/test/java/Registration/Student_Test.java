package Registration;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class Student_Test {

	@Test
	public void test() {
		
		Student student = new Student("cian",22, new Date(),1);

		assertEquals("cian22", student.getUserName());
	}

}
