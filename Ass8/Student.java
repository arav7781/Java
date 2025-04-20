// Student.java import
java.time.LocalDate;
public class Student {
private String prn;
private String name;
private LocalDate dob;
private double marks;
 public Student(String prn, String name, LocalDate dob, double
marks) { this.prn = prn; this.name = name;
this.dob = dob; this.marks = marks;
 }
 public String getPrn() { return prn; }
public String getName() { return name; }
public LocalDate getDob() { return dob; }
public double getMarks() { return marks; }
 public void setName(String name) { this.name = name; }
public void setDob(LocalDate dob) { this.dob = dob; }
public void setMarks(double marks) { this.marks = marks; }
 @Override public String toString() { return "PRN: " + prn + ", Name: "
+ name + ", DOB: " + dob + ", Marks: " + marks; }
}
// Operations.java import
java.time.LocalDate;
import java.util.*;
public class Operations { static Scanner
sc = new Scanner(System.in);
 public static void addStudent(ArrayList<Student> students) throws CustomException {
try {
 System.out.print("Enter PRN: "); String prn = sc.nextLine();
for (Student s : students) { if (s.getPrn().equals(prn))
throw new DuplicateStudentException("Student with PRN already exists!"); }
 System.out.print("Enter Name: ");
 String name = sc.nextLine();
 System.out.print("Enter DOB (YYYY-MM-DD): ");
 LocalDate dob = LocalDate.parse(sc.nextLine());
System.out.print("Enter Marks: "); double marks
= sc.nextDouble(); sc.nextLine();
students.add(new Student(prn, name, dob, marks));
 System.out.println("Student added successfully!");
 } catch (Exception e) { throw new
InvalidInputException("Invalid input. Try again.");
 }
}
