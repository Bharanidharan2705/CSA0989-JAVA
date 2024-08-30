import java.util.Scanner;

public class grade
{
	

	
	    String name;
	    int rollNo;
	    int total;
	    double aggregate;

	    public grade(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	    }

	    public void calculateGrade(int total) {
	        this.total = total;
	        this.aggregate = (double) total / 6;
	        System.out.println("Name: " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Total: " + total);
	        System.out.println("Aggregate: " + aggregate + "%");
	        if (aggregate >= 75) {
	            System.out.println("Grade: Distinction");
	        } else if (aggregate >= 60 && aggregate < 75) {
	            System.out.println("Grade: First Division");
	        } else if (aggregate >= 50 && aggregate < 60) {
	            System.out.println("Grade: Second Division");
	        } else if (aggregate >= 40 && aggregate < 50) {
	            System.out.println("Grade: Third Division");
	        } else {
	            System.out.println("Grade: FAIL");
	        }
	    }

	    public static void main(String[] args) {
	        try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter student name: ");
				String name = scanner.next();
				System.out.println("Enter student roll no: ");
				int rollNo = scanner.nextInt();
				System.out.println("Enter total marks: ");
				int total = scanner.nextInt();
				grade grade = new grade(name, rollNo);
				grade.calculateGrade(total);
			}
	    }
	}

