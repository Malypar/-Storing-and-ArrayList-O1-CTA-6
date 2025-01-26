public class Student {
    // Fields storing the student's roll number, name, and address
    private final int rollno;
    private final String name;
    private final String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    // Getter for the roll number
    public int getRollno() {
        return rollno;
    }
    // Getter for the name
    public String getName() {
        return name;
    }
    // Getter for the address
    public String getAddress() {
        return address;
    }
    // Overriding the toString method to return a string representation of the student
    @Override
    public String toString() {
        return "[Roll#: " + rollno + ", Name: " + name + ", Address: " + address + "]";
    }
}