package class14Tasks;

public class Taskk6 {
    Boolean IsPrime(int y) {
        boolean IsPrime=true;
        if (y > 1) {
            for (int i = 2; i < y; i++) {
                if (y % i == 0) {
                    IsPrime = false;
                    break;
                }
            }
                } else {
                    IsPrime=false;
        }
        return IsPrime;
    }

    public static void main(String[] args) {
        Taskk6 find=new Taskk6();
        System.out.println(find.IsPrime(2));
        System.out.println(find.IsPrime(4));

    }
}
