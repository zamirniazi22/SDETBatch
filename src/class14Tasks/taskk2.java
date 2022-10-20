package class14Tasks;

public class taskk2 {
    void isEvenOdd(int i){
        if(i%2==0){
            System.out.println("it is Even number");
        }else{
            System.out.println("it is Odd number");
        }
    }

    public static void main(String[] args) {
        taskk2 find=new taskk2();
        find.isEvenOdd(5);
        find.isEvenOdd(2);
    }
}
