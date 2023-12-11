import javax.swing.plaf.ColorUIResource;

public class PrintOut {
    public void printOutTable(CourseRecord [] record) {
        System.out.println("\nBreakdown of Entries");
        System.out.println("|---------------|--------------|-------|--------------|");
        System.out.printf("| %13s | %12s | %6s | %10s |\n", "COURSE & CODE", "COURSE UNIT", "GRADE", "GRADE-UNIT");
        System.out.println("|---------------|--------------|-------|--------------|");
        for (CourseRecord  courseInput: record) {
            System.out.printf("| %-13s | %-11d | %-5s | %-10d |\n", courseInput.getCourseCode(), courseInput.getCourseUnit(),courseInput.getCourseGrade(), courseInput.getCourseGradeUnit());
        }
        System.out.println("|-----------------------------------------------------|\n");
        BackendCalculator compute = new BackendCalculator();
        System.out.printf("Your GPA = %.2f to two decimal places", compute.avgFunction(record));
    }
}
