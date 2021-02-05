// 2. Student Fee Details - Finance Department
// book fees
// class fees
public class StudentFees extends StudentDetails{
	private double bookFees;
	private double classFees;
	public StudentFees() {
	}
	public StudentFees(int bookFees, int classFees) {
		super();
		this.bookFees = bookFees;
		this.classFees = classFees;
	}
	public StudentFees(int studentNo) {
		super.setStudentNumber(studentNo);
	}
	public double getBookFees() {
		return bookFees;
	}
	public void setBookFees(double bookFees) {
		this.bookFees = bookFees;
	}
	public double getClassFees() {
		return classFees;
	}
	public void setClassFees(double classFees) {
		this.classFees = classFees;
	}

}
