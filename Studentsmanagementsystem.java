import java.util.ArrayList;
import java.util.Scanner;

// Represent a student with name and ID
class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Stor students record and scan user's input
public class Studentsmanagementsystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        // Show Options and print the choice
        do {
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            // Perform actions
            switch (choice) {
                case 1:addStudent();break;
                case 2:viewStudents();break;
                case 3:searchStudent();break;
                case 4:removeStudent();break;
                case 5:System.out.println("Exiting...");break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5); // a loop keep asking until press exit.
    }

    // Add new student name and id.
    private static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        students.add(new Student(name, id));
        System.out.println("Student added successfully.");
    }

    // View students list
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println("Name: " + student.name + ", ID: " + student.id);
            }
        }
    }

    // Search for students with ID
    private static void searchStudent() {
        System.out.print("Enter student ID to search: ");
        int id = scanner.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.id == id) {
                System.out.println("Student found: Name: " + student.name + ", ID: " + student.id);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("student not found.");
        }
    }

    // Remove student from list with ID
    private static void removeStudent() {
        System.out.print("Enter student ID to remove: ");
        int id = scanner.nextInt();
        boolean removed = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Student not found.");
        }
    }
}
