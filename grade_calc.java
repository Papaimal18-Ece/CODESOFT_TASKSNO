import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int subjects = sc.nextInt();
        int totalmarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks of subject" + i + " (out of 100): ");
            int marks = sc.nextInt();
            totalmarks += marks;
        }
        double average = (double) totalmarks / subjects;
    char grade;
    if (average >= 90)
        grade = 'A';
    else if (average >= 80)
        grade = 'B';
    else if (average >= 70)
        grade = 'C';
    else if (average >= 60)
        grade = 'D';
    else
        grade = 'F';

    System.out.println("\n===== RESULT =====");
    System.out.println("Total Marks = " + totalmarks);
    System.out.println("Average parcentage = " + average + "%");
    System.out.println("Grade = " + grade);
    sc.close();
    }
}