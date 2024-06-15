import java.util.Scanner;

public class StudentGradeCalculator{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator");
        System.out.println("Please enter the marks obtained (out of 100) in each subject:");

        System.out.println("Enter the number of subjects:");
        int numofSubjects=scanner.nextInt();

        int[]marks = new int[numofSubjects];
        for(int i=0;i<numofSubjects;i++) {
            System.out.println("Enter marks of subject" + (i + 1) + ":");
            marks[i] = scanner.nextInt();
        }
        int totalMarks=0;
        for(int mark:marks){
            totalMarks += mark;
        }
        double averagePercentage=(double)totalMarks/numofSubjects;
        char grade;
        if(averagePercentage>=90){
            grade='A';

        } else if (averagePercentage>=80) {
            grade='B';
        }
        else if (averagePercentage>=70) {
            grade='C';
        }
        else if (averagePercentage>=60) {
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("\nResult:");
        System.out.println("Total Marks:"+totalMarks);
        System.out.printf("Average Percentage:%2f%%\n",averagePercentage);
        System.out.println("Grade:"+grade);

        scanner.close();
    }
}
