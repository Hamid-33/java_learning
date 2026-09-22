import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    static int sum(int[] arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
    static double avg(int totalmarks,int marks[]){
        return (double) totalmarks / marks.length;
    }
    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        boolean isEnrolled;
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your GPA: ");
        gpa = sc.nextDouble();
        System.out.println("Enter your marks for 3 subjects:");
        for (int i=0;i<marks.length;i++){
            System.out.println("Marks are: " );
            marks[i] = sc.nextInt();
            System.out.println("Marks are: " + marks[i]);
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Marks: " + Arrays.toString(marks));
        int totalMarks = sum(marks);
        System.out.println("Total Marks: " + totalMarks);
        double average = avg(totalMarks, marks);
        System.out.println("Average Marks: " + average);
    }
}
