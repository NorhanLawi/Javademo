import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the scores for 6 subjects:");

        int totalScore = 0;
        int numSubjects = 6;
        
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter the score for subject " + i + ": ");
            int score = scanner.nextInt();
            totalScore += score;
        }
        
        double averageScore = (double) totalScore / numSubjects;
        
        System.out.println("Average Score: " + averageScore);
        
        char grade;

        if (averageScore >= 90) {
            grade = 'A';
        } else if (averageScore >= 80) {
            grade = 'B';
        } else if (averageScore >= 70) {
            grade = 'C';
        } else if (averageScore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        System.out.println("Grade: " + grade);
        
        scanner.close();
    }
