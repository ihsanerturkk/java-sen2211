
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
        //return 4;
        //grade --> F
        return switch (grade) {
            case "A" ->
                //return 4;
                    4;
            case "A-" -> 3.67;
            case "B+" -> 3.33;
            case "B" -> 3;
            case "B-" -> 2.67;
            case "C+" -> 2.33;
            case "C" -> 2;
            case "D" -> 1;
            default ->
                //grade --> F
                    0;
        };
    }


}
