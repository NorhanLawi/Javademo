import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int totalScore = 0;
        
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the score for student " + i + ": ");
            int score = scanner.nextInt();
            totalScore += score;
        }
        
        double averageScore = (double) totalScore / numStudents;
        
        System.out.println("Average Score: " + averageScore);
        
        // Determine the grade based on the average score
        if (averageScore >= 90) {
            System.out.println("Grade: A");
        } else if (averageScore >= 80) {
            System.out.println("Grade: B");
        } else if (averageScore >= 70) {
            System.out.println("Grade: C");
        } else if (averageScore >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        
        scanner.close();
    }
}
