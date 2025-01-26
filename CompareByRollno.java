import java.util.Comparator;

public class CompareByRollno implements Comparator<Student> {
    // Compare method to compare two students by roll number
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
