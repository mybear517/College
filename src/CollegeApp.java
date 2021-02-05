
public class CollegeApp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// add students
		// pay class
		// get test scores

		StudentDetails sd = new StudentDetails();

		CollegeUtil util = new CollegeUtil(5);
		util.addStudent(new StudentDetails(101, "venna", "venna@gmail.com"));
		util.addStudent(new StudentDetails(102, "Smith", "smith@gmail.com"));
		util.addStudent(new StudentDetails(103, "Johnson", "johnson@gmail.com"));
		util.addStudent(new StudentDetails(104, "Carl", "carl@gmail.com"));
		System.out.println("Created New Students" );

		//   StudentFees sf = new StudentFees(12,15);
		//   TestScores ts = new TestScores("java","a");

	}

}
