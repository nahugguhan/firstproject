package inheritance;

public class Student extends college {
	public void studentName() {
		System.out.println("guhan s");
	}

	public void studentDept() {
		System.out.println("royal ECE");
	}

	public void studentId() {
		System.out.println("511314106015");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.Hostel();
		s.Dept();
	

         
	}
}

