import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        System.out.println("Welcome to Your Favourite GPA  Calculator");
        System.out.println("How many courses did you take this semester? ");
        int index = 0, noOfCourses, unit = 0, score= 0;
        input = new Scanner(System.in);

        while (true) {
            try {
                noOfCourses = input.nextInt();
                if (noOfCourses < 0 ) {
                    System.out.println("Enter a value greater than 0: ");
                }else if (noOfCourses == 0 ) {
                    System.out.println("Thank you for using this calculator");
                    System.exit(0);
                }else {
                    break;
                }
            }catch (InputMismatchException ex) {
                System.out.print("Invalid input. Please enter a positive integer: ");
                input.next();
            }
        }

        CourseRecord [] record = new CourseRecord[noOfCourses];

        try{
            while (index < noOfCourses) {
                CourseRecord newEntry = new CourseRecord();
                input = new Scanner(System.in);
                System.out.printf("Input: %d\nEnter course %d name & code: ", index + 1, index + 1);
                newEntry.setCourseCode(input.nextLine());
                System.out.print("Enter the course unit: ");

                while (true) {
                    try {
                        input = new Scanner(System.in);
                        unit = input.nextInt();
                        if (unit < 0 || unit > 6) {
                            System.out.print("Enter a value from 1 to 6: ");
                        } else {
                            newEntry.setCourseUnit(unit);
                            break;
                        }
                    } catch (InputMismatchException ex) {
                        System.out.print("Invalid input. Please enter a valid integer for course unit: ");
                        input.next();
                    }
                }
                while (true) {
                    try {
                        input = new Scanner(System.in);
                        System.out.print("Enter your score: ");
                        score = input.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.print("Enter a value greater than or equal to 0 and less than 100: ");
                        } else {
                            newEntry.setCourseScore(score);
                            break;
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("Invalid input. Please enter a valid integer for score.");
                        input.next();
                    }
                }
                record[index] = newEntry;
                index++;
            }
        }catch (InputMismatchException ex) {
            System.out.println("You have entered a non-integer value. Please re-enter details for the course.");
        }
        PrintOut print = new PrintOut();
        print.printOutTable(record);
    }
}