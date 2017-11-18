public class Student {			//Student 클래스 생성
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String department, String id, double grade) {//생성자 사용
		this.name = name;					//초기화
		this.department = department;
		this.id = id;
		this.grade = grade;
	}
	public void setName(String name) { //setName만들기
		this.name = name;
	}
	public String getName() {	//getName name반환하기
		return name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public double getGrade() {
		return grade;
	}
}