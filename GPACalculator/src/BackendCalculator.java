public class BackendCalculator {
    public double avgFunction(CourseRecord [] record) {
        double totalGradePoint = 0;
        double totalGradeUnit = 0;
        int index = 0;

        while (index < record.length) {
            totalGradePoint += record[index].getCourseGradeUnit() * record[index].getCourseUnit();
            totalGradeUnit += record[index].getCourseUnit();

            index++;
        }

        return (totalGradePoint / totalGradeUnit);
    }
}
