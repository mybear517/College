
public class CollegeUtil {
	private StudentDetails[] arr;

	public CollegeUtil(int size) {
		arr = new StudentDetails[size];
	}
	public boolean addStudent(StudentDetails sa) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = sa;
				return true;
			}
		}
		return false;	
	}
	public boolean modifyStudent(int studentNo, StudentDetails sa) {
		for(int i=0; i< arr.length; i++) {
			if(arr[i].getStudentNumber() == studentNo) {
				arr[i] = sa;
				return true;
			}
		}
		return false;
	}

}

