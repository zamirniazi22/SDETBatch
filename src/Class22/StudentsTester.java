package Class22;

public class StudentsTester {
    public static void main(String[] args) {
        Student[]Students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for(Student mixStudents:Students){
            mixStudents.Studying();
            mixStudents.Writing();
            mixStudents.Reading();
           /* SyntaxStudent syntax=new SyntaxStudent();
            syntax.java();
            CollegeStudent college = new CollegeStudent();
            college.fallinlove();
            SchoolStudent school = new SchoolStudent();
            school.disturbing();*/


        }

    }
}
