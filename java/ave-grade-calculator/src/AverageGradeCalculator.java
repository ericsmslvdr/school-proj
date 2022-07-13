
import java.util.Scanner;

public class AverageGradeCalculator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String sName = in.nextLine();

        System.out.print("Midterm grade: ");
        double midGrade = in.nextDouble();
        System.out.print("Finals grade: ");
        double finalGrade = in.nextDouble();

        double genAve = (midGrade + finalGrade) / 2;
        System.out.println("General Average: " + genAve);

        if (genAve >= 95) {
            System.out.println("Remarks: Excellent");
        } else if (genAve >= 90 && genAve <= 94.9) {
            System.out.println("Remarks: Very Good");
        } else if (genAve >= 85 && genAve <= 89.9) {
            System.out.println("Remarks: Good");
        } else if (genAve >= 80 && genAve <= 84.9) {
            System.out.println("Remarks: Average");
        } else if (genAve >= 75 && genAve <= 79.9) {
            System.out.println("Remarks: Needs Improvement");
        } else if (genAve < 75) {
            System.out.println("Remarks: Failed");
        }

    }

}
