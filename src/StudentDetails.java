// 1. Student details - Administration Department
// student number
// student name
// student email
public class StudentDetails {
	// instance variable
	private int studentNumber;
	private String name;
	private String email;

	// class variable
	private static int lastStudentNo = 0;
	public StudentDetails() {
	}
	public StudentDetails(int stNo, String name, String email) {
		this.studentNumber = stNo;
		this.name = name;
		this.email = email;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
