package class14;

public class addition {
    void add(int x, int y){
        System.out.println(x+y);
    }

public static void main(String[]args) {
    addition obj=new addition();
    obj.add(10,20);
    System.out.println("*******************");
    obj.add(10,40);
    System.out.println("*******************");
    obj.add(10,90);




}
}