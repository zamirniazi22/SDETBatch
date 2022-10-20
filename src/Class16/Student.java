package Class16;

public class Student {
    String Name;
    String ID;
     static int  numberOfStudents;

    public static void main(String[] args) {
        Student student1= new Student();
        student1.Name="Sahil";
        student1.ID="12A";
        student1.numberOfStudents++;
        Student student2= new Student();
        student2.Name="Shadab";
        student2.ID="13B";
        student2.numberOfStudents++;
        Student student3= new Student();
        student3.Name="Matin";
        student3.ID="14C";
        student3.numberOfStudents++;
        System.out.println(Student.numberOfStudents );




    }
}
