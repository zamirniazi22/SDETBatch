package class14;

public class MethodDemo3p {
    boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        MethodDemo3p md=new MethodDemo3p();
       if(md.isEven(5)) {
           System.out.println("number is even");
       }else{
           System.out.println("number is odd");
       }
    }
    }