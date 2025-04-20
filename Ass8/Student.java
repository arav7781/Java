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
}public static void displayStudents(ArrayList<Student> students) throws CustomException
{ if (students.isEmpty()) throw new StudentNotFoundException("No students to
display."); for (Student s : students) {
 System.out.println(s);
 }
}
 public static void searchMenu(ArrayList<Student> students) throws CustomException
{ System.out.println("1. Search by PRN\n2. Search by Name\n3. Search by
Position"); int opt = sc.nextInt(); sc.nextLine(); switch (opt) {
case 1:
 System.out.print("Enter PRN:
"); String prn = sc.nextLine();
for (Student s : students) {
if (s.getPrn().equals(prn)) {
System.out.println(s);
return;
 } } throw new
StudentNotFoundException("Student not found by PRN."); case 2:
 System.out.print("Enter Name: ");
String name = sc.nextLine(); boolean found
= false; for (Student s : students) {
if (s.getName().equalsIgnoreCase(name)) {
System.out.println(s); found =
true;
 } } if (!found) throw new
StudentNotFoundException("Student not found by name."); break;
case 3:
 System.out.print("Enter Position (0-indexed): "); int pos = sc.nextInt();
sc.nextLine(); if (pos < 0 || pos >= students.size()) throw new
InvalidInputException("Position out of bounds."); System.out.println(students.get(pos));
break;
default:
 throw new InvalidChoiceException("Invalid search choice!");
 }
}
 public static void updateStudent(ArrayList<Student> students) throws CustomException {
 System.out.print("Enter PRN to update:
"); String prn = sc.nextLine();
for (Student s : students) { if
(s.getPrn().equals(prn)) {
 System.out.print("Enter new Name: ");
 s.setName(sc.nextLine());
 System.out.print("Enter new DOB (YYYY-MM-DD): ");
 s.setDob(LocalDate.parse(sc.nextLine()));
System.out.print("Enter new Marks: ");
 s.setMarks(sc.nextDouble());
sc.nextLine();
 System.out.println("Student updated successfully!");
return;
 } } throw new
StudentNotFoundException("Student not found to update.");
 }
 public static void deleteStudent(ArrayList<Student> students) throws CustomException {
 System.out.print("Enter PRN to delete: ");
 String prn = sc.nextLine();
 Iterator<Student> it =
students.iterator(); while (it.hasNext())
{ if (it.next().getPrn().equals(prn))
{ it.remove();
 System.out.println("Student deleted successfully!");
return;
 } } throw new
StudentNotFoundException("Student not found to delete."); }
}
/
