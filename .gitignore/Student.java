public class Student {			//Student Ŭ���� ����
	private String name;
	private String department;
	private String id;
	private double grade;
	
	public Student(String name, String department, String id, double grade) {//������ ���
		this.name = name;					//�ʱ�ȭ
		this.department = department;
		this.id = id;
		this.grade = grade;
	}
	public void setName(String name) { //setName�����
		this.name = name;
	}
	public String getName() {	//getName name��ȯ�ϱ�
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