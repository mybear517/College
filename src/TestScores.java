//3. Student Exam Details - Examination Department
// Class
// score
public class TestScores extends StudentDetails{
	private String examClass;
	private String score;
	public TestScores() {
	}
	public TestScores(String examClass, String score) {
		this.examClass = examClass;
		this.score = score;
	}
	public String getExamClass() {
		return examClass;
	}
	public void setExamClass(String examClass) {
		this.examClass = examClass;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}	

}
