package class14Tasks;

import java.sql.SQLOutput;

public class taskk4 {
    void sayHello(String country){
        if(country.equals("USA")){
            System.out.println("Hello");
        }else if(country.equals("Afghanistan")){
            System.out.println("Salam Aluikom");
        }else if (country.equals("Iran")){
            System.out.println("Saloom");
        }else if(country.equals("India")){
            System.out.println("Namasti");
        }
    }

    public static void main(String[] args) {
        taskk4 find= new taskk4();
        find.sayHello("USA");
        find.sayHello("Afghanistan");
        find.sayHello("Iran");
        find.sayHello("India");

    }
}
