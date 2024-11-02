import java.util.ArrayList;

public class Student {
	private String name;
	private int ID;
	private double GPA;
	private String department;
	
	public ArrayList<Course> courseList = new ArrayList<>();
	
	public Student () {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		String list = "";
		
		for (int i = 0; i < courseList.size(); i++) {
			list += courseList.get(i).getName();
		}
		
		return "Student [name=" + name + ", ID=" + ID + ", GPA=" + GPA + ", department=" + department + ", courseList="
				+ list + "]";
	}
	
	public double calculateGPA () {
		double totalCredits = 0;
		double totalPoints = 0;
		
		for (int i = 0; i < courseList.size(); i++) {
			totalCredits += courseList.get(i).getCredit();
			//totalCredits = totalCredits + courseList.get(i).getCredit();
			totalPoints += (courseList.get(i).calculateGrade() 
					* courseList.get(i).getCredit());
		}
		
		double result = totalPoints / totalCredits;
		return result;	
		
	}
	
	
	
	
	
	

}
