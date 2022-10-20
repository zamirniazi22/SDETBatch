package class14;

public class MethodDemo1 {
    // A method that
    void printHello(){
        System.out.println("Hello world");
        System.out.println("Hello every one ");
        System.out.println("Hello America");
        System.out.println("Hello Afghaniatan");


}
    void printworld(String word) {
        System.out.println(word);
    }
public static void main(String[]args){
    MethodDemo1 obj= new MethodDemo1();
    obj.printHello();
    obj.printworld("how are yuo world");
    obj.printworld("how are yuo ");
    }
}