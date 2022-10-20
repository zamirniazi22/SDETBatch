package Class20;

public class Task1 {
   // Write program for multilevel inheritance where class C inherits from class B
    // and Class B inherits from Class A.
   static class A{
       static void print(){
           System.out.println("I love you");
               System.out.println("I hate you");

       }

   }

    static class B extends A{

    }

    static class C extends B {

    }

    public static void main(String[] args) {
        A a = new A();
        a.print();
        B b = new B();
        b.print();


    }



}

