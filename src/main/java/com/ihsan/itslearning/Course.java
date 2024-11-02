
public class Course {
    private String name;
    private String grade;
    private int credit;

    public Course() {
        super();
    }

    public Course(String name, String grade, int credit) {
        super();
        this.name = name;
        this.grade = grade;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double calculateGrade() {
        double gradePoint = 0;
        if (grade.equals("A"))
            //return 4;
            gradePoint = 4;
        else if (grade.equals("A-"))
            gradePoint = 3.67;
        else if (grade.equals("B+"))
            gradePoint = 3.33;
        else if (grade.equals("B"))
            gradePoint = 3;
        else if (grade.equals("B-"))
            gradePoint = 2.67;
        else if (grade.equals("C+"))
            gradePoint = 2.33;
        else if (grade.equals("C"))
            gradePoint = 2;
        else if (grade.equals("D"))
            gradePoint = 1;
        else
            //grade --> F
            gradePoint = 0;
        return gradePoint;
    }


}
