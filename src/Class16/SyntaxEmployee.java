package Class16;

public class SyntaxEmployee {
     String EmpID;
     int salary;
     static String Ceo="Sumair";

    public static void main(String[] args) {
        SyntaxEmployee Emp1= new SyntaxEmployee();
        Emp1.EmpID="123Z";
        Emp1.salary=1000;
        System.out.println(SyntaxEmployee.Ceo);
        SyntaxEmployee Emp2= new SyntaxEmployee();
        Emp2.EmpID="123x";
        Emp2.salary=10000;
        System.out.println(Emp2);
        System.out.println(SyntaxEmployee.Ceo);

    }


}
