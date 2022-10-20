package Class20;

public class MethodoverloadingD2 {
    static void F1(String name, int number){
        System.out.println("1");
    }
    static void F1(String name,int number,int number2){
        System.out.println(" 2");
    }
    static void F1(int num1 ,int number){
        System.out.println(" 2");
    }
    static void F1(int number,String name){
        System.out.println("3");
        }

    public static void main(String[] args) {
        MethodoverloadingD2 md=new MethodoverloadingD2();
        md.F1("khan",2);
    }
}
