import java.util.Scanner;

public class GradeCalculator{
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Score: ");
    int getStudentScore = scanner.nextInt();

    char calculateGrade;
    
    if (getStudentScore >= 90) {
        calculateGrade = 'A';
    } else if (getStudentScore >= 80) {
        calculateGrade = 'B';
    } else if (getStudentScore >= 70) {
        calculateGrade = 'C';
    } else if (getStudentScore >= 60) {
        calculateGrade = 'D';
    } else {
        calculateGrade = 'F';
    }

    System.out.println("Your Grade is: " + calculateGrade);
    scanner.close();
    }
}