package studentmanagement;

import java.util.*;

public class StudentManager {
    List<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public  void menu() {
        while (true) {
            System.out.println("\n--- Student Management Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 :
                	addStudent();
                	break;
                case 2 : 
                	viewStudents();
                	break;
                case 3 :
                	deleteStudent();
                	break;
                case 4 : 
                    System.out.println("Exiting...");
                    return;
                default :
                	System.out.println("Invalid choice.");
            }
        }
    }

    void addStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        students.add(new Student(id,name,age));
        System.out.println("Student added successfully.");
    }

    void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    void deleteStudent() {
        System.out.print("Enter ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        students.removeIf(s -> s.id == id);
        System.out.println("Student deleted if ID matched.");
    }
}

