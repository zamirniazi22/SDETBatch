package Class20;

public class Task2 {
    //Write program to inherit class A that has method printF which is static
    //and call or reuse that method into class B
   static class A{
        void printF(){
           System.out.println('F');
       }
    }
    static class B extends A {
}

    public static void main(String[] args) {
        B b= new B();
        b.printF();

    }
}
