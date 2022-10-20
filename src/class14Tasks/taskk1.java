package class14Tasks;

public class taskk1 {
    void printlarger(int a, int b){
        if(a>b){
            System.out.println("first number is greater than number 2 "+a);
        }else if(b>a){
            System.out.println("second number is greater than number one "+b);
        }



    }
    public static void main(String[]args){
        taskk1 find=new taskk1();
        find.printlarger(20,30);
        find.printlarger(50,40);
    }
}
