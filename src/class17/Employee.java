package class17;

public class Employee {

       private String name;
       private String Department;
        private Double salary;
        private String id;
        private int age;
        private double actualsalary;
        static String campanyName="Syntax";
        Employee(String  empname , String empdepartment , double empsalary, int empage){
            name=empname;
            Department=empdepartment;
            salary=empsalary;
            age=empage;

        }

        void printsalary(){
            double actualsalary=salary+20000+10000;
            System.out.println(actualsalary);
        }
        void calculateprinttax(){
            double tax=actualsalary*.3;
            System.out.println("tax"+tax);

        }

        public static void main(String[] args) {
            Employee zamir = new Employee("zamir", "IT", 120000, 29);
            zamir.printsalary();
            zamir.calculateprinttax();
        }
    }

