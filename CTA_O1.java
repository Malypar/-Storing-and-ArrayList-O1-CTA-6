import java.util.ArrayList;
import java.util.List;

public class CTA_O1 {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> studentList = new ArrayList<>();
        // Add students to the list
        studentList.add(new Student(075, "Alice", "123 Main St"));
        studentList.add(new Student(074, "Bob", "456 Elm St"));
        studentList.add(new Student(076, "Charlie", "789 Oak St"));
        studentList.add(new Student(072, "David", "101 Pine St"));
        studentList.add(new Student(053, "Eve", "202 Maple St"));
        studentList.add(new Student(063, "Frank", "303 Cedar St"));
        studentList.add(new Student(020, "Grace", "404 Walnut St"));
        studentList.add(new Student(054, "Heidi", "505 Birch St"));
        studentList.add(new Student(011, "Ivan", "606 Spruce St"));
        studentList.add(new Student(065, "Judy", "707 Fir St"));
        studentList.add(new Student(055, "Kevin", "808 Redwood St"));
        studentList.add(new Student(044, "Linda", "909 Sequoia St"));
        studentList.add(new Student(040, "Mike", "1010 Hemlock St"));
        studentList.add(new Student(033, "Nancy", "1111 Sycamore St"));
        studentList.add(new Student(041, "Oscar", "1212 Cedar St"));

        // Display the original list
        System.out.println("Original list:");
        display(studentList);

        // Sort the list based on roll number and name
        CustomSelectionSort.applySelectionSort(studentList, new CompareByRollno());
        System.out.println("\nSorted by roll number:");
        display(studentList);

        CustomSelectionSort.applySelectionSort(studentList, new CompareByName());
        System.out.println("\nSorted by name:");
        display(studentList);
    }

    // Helper method to display the list of students
    private static void display(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }
}
