package class18;

public class Student {
//Write a java Class Students that have a constructor which takes students name and 3 subject grades.
// Inside your class also have a method to Calculate Average Grade.
// Test Student class for 5 different students with different marks.
// Your program should print an average mark of each students name.
    String name;
    double subject1;
    double subject2;
    double subject3;

 public   Student (String Sname, double sub1, double sub2, double sub3){
        name=Sname;
        subject1=sub1;
        subject2=sub2;
        subject3=sub3;

    }
    void calculateAverage(){
        System.out.println(name +" "+(subject1+subject2+subject3)/3);
    }




}
