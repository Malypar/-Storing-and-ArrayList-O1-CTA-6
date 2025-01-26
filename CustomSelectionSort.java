import java.util.Comparator;
import java.util.List;

public class CustomSelectionSort {
    // Selection Sort algorithm to sort a list of students based on the given comparator
    public static void applySelectionSort(List<Student> students, Comparator<Student> comp) {
        int n = students.size();
        // Outer loop to iterate through the list except the last element
        for (int i = 0; i < n - 1; i++) {
            // The element at index i is assumed to be the minimum
            int minIndex = i;

            // Inner loop to find the minimum element in the unsorted part of the list
            for (int j = i + 1; j < n; j++) {
                // Compare the current element with the assumed minimum element
                if (comp.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element of the unsorted part
            if (minIndex != i) {
                Student temp = students.get(i);
                students.set(i, students.get(minIndex));
                students.set(minIndex, temp);
            }
        }
    }
}
