import java.util.Comparator;

public class CompareByName implements Comparator<Student> {
    // Compare method to compare two students by name
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareToIgnoreCase(s2.getName());
    }
}