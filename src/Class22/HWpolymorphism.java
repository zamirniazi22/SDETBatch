package Class22;

public class HWpolymorphism {

}
    /*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeCollegeStudent, SchoolStudent.
        Define common behavior within parent class and override some of the methods in child classes
        Define some methods specific to child classes
        Write example of achieving run time polymorphism*/
    class Student{
    void Studying(){
        System.out.println("good students studying hard");
    }
    void Writing(){
        System.out.println("students always learn writing after third class");
    }
    void Reading(){
        System.out.println("students always learn writing after second class");
    }
    }
class SyntaxStudent extends Student{
    void Studying(){
        System.out.println("good SyntaxStudents studying hard");
    }
    void Writing(){
        System.out.println("SyntaxStudents always learn writing code after second month");
    }
    void Reading(){
        System.out.println("SyntaxStudents  learn reading codes after first month");
    }
   void java(){
        System.out.println("Syntax Students love java");
    }

}
class CollegeStudent extends Student{
    void Studying(){
        System.out.println("CollegeStudents studying hard");
    }
    void Writing(){
        System.out.println("CollegeStudents always learn writing poem from college");
    }
    void Reading(){
        System.out.println("CollegeStudents always learn formula from reading books");
    }
    void fallinlove(){
        System.out.println("collegeStudents always fallinlove in college");
    }

}
class SchoolStudent extends Student{
    void Studying(){
        System.out.println("some SchoolStudents studying hard");
    }
    void Writing(){
        System.out.println("SchoolStudents always learn writing from school");
    }
    void Reading(){
        System.out.println("SchoolStudents always learn writing from school");
    }
    void disturbing(){
        System.out.println("Schoolstudents always disturbing teachers in the class");
    }

}
