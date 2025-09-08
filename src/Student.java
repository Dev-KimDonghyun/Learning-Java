public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public static void main(String[] args) {
        Student studentKim = new Student();
        studentKim.studentID = 2025;
        studentKim.studentName = "KimDonghyun";
        studentKim.address = "Daegu, Republic of Korea";
        studentKim.grade = 1;

        System.out.println(studentKim.studentName);
        System.out.println(studentKim.getStudentName());
        System.out.println(studentKim.studentID);
        System.out.println(studentKim.getStudentID());
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}
