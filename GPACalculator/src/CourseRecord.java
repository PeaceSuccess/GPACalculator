public class CourseRecord {
    private String courseCode;
    private int courseUnit;
    private int courseScore;
    private String courseGrade;
    private int courseGradeUnit;

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseUnit(int courseUnit) {
        this.courseUnit = courseUnit;
    }
    public int getCourseUnit() {
        return courseUnit;
    }

    public void setCourseScore(int score) {
        this.courseScore = score;
        if (this.courseScore >= 70) {
            this.courseGradeUnit = 5;
            this.courseGrade = "A";
        } else if (this.courseScore >= 60) {
            this.courseGradeUnit = 4;
            this.courseGrade = "B";
        } else if (this.courseScore >= 50) {
            this.courseGradeUnit = 3;
            this.courseGrade = "C";
        } else if (this.courseScore >= 45) {
            this.courseGradeUnit = 2;
            this.courseGrade = "D";
        } else if (this.courseScore >= 40) {
            this.courseGradeUnit = 1;
            this.courseGrade = "E";
        } else if (this.courseScore >= 0) {
            this.courseGradeUnit = 0;
            this.courseGrade = "F ";
        }
    }
    public String getCourseGrade() {
        return this.courseGrade;
    }
    public int getCourseGradeUnit() {
        return this.courseGradeUnit;
    }
}
